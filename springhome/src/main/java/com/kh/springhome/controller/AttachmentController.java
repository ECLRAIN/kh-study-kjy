package com.kh.springhome.controller;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kh.springhome.entity.AttachmentDto;
import com.kh.springhome.repository.AttachmentDao;

@RestController //@Controller +ResponseBody
//화면을 반환하지 않는 컨트롤러 
public class AttachmentController {

	@Autowired
	private AttachmentDao attachmentDao;
	
	@GetMapping("/download/{attachmentNo}")
	public ResponseEntity<ByteArrayResource> download(@PathVariable int attachmentNo) throws IOException{
		//[1] 파일 탐색(DB)
		AttachmentDto dto = attachmentDao.selectOne(attachmentNo);
		if(dto == null) {//파일이 없으면
			return ResponseEntity.notFound().build();//404 error 전송
	}
		//[2] 파일 불러오기
				File dir = new File("D:/upload");
				File target = new File(dir, String.valueOf(attachmentNo));
				byte[] data = FileUtils.readFileToByteArray(target);
				ByteArrayResource resource = new ByteArrayResource(data);
				
				//[3] 응답 객체를 만들어 데이터를 전송
				return ResponseEntity.ok()
//				.header("Content-Encoding", "UTF-8")
				.header(HttpHeaders.CONTENT_ENCODING, 
												StandardCharsets.UTF_8.name())
//				.header("Content-Length", String.valueOf(dto.getAttachmentSize()))
				.contentLength(dto.getAttachmentSize())
				
//				.header("Content-Type", dto.getAttachmentType())
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				
//				.header("Content-Disposition", "attachment; filename="+dto.getAttachmentName())
				.header(HttpHeaders.CONTENT_DISPOSITION, 
									ContentDisposition.attachment()
											.filename(
													dto.getAttachmentName(), 
													StandardCharsets.UTF_8)
											.build().toString())
				.body(resource);
	}
}
