package com.kh.springhome.entity;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 파일 관련된 정보 중 무어을 db에 넣을 것인가
// pk(시퀀스)
//사용자가 업로드한 파일명
//실제로 저장돤 파일명(시퀀스)
@Data  @NoArgsConstructor @AllArgsConstructor @Builder
public class AttachmentDto {
	private int seq;
	private int attachmentNo;
	private String attachmentName, attachmentType;
	private long attachmentSize;
	private Date attachmentTime;
}
