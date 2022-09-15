package com.kh.spring07.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.spring07.entity.GuestbookDto;

@Controller
@RequestMapping("/guest-book")
public class GuestbookController {
		@Autowired 
		private JdbcTemplate jdbcTemplate;
		
		@RequestMapping("/insert")
		@ResponseBody
		public String insert(
				@RequestParam int no,
				@RequestParam String name,
				@RequestParam String memo) {
			//(ModelAttribute) ModelAttribute는 객체의 필드에 자동 매핑을 
			//수행한다 이름이 안같으면 안받아준다
			String sql="insert into guest_book(no,name,memo)"
					+ "values(?,?,?)";
			Object[] param= {no,name,memo};
			jdbcTemplate.update(sql,param);
			return "등록완료";
		}
		@RequestMapping("/list")
		@ResponseBody
		public String select() {
			String sql="select * from guest_book order by no asc";
			List<GuestbookDto> list=
					jdbcTemplate.query(sql, GuestbookDto.getMapper());
			StringBuffer buffer=new StringBuffer();
			for(GuestbookDto dto:list) {
				buffer.append(dto);
				buffer.append("<br>");
			}
			return buffer.toString();
		}
		
		@RequestMapping("/delete")
		@ResponseBody
		public String delete(@RequestParam int no) {
			String sql="delete guest_book where no=?";
			Object[] param= {no};
			int result=jdbcTemplate.update(sql,param);
			if(result>0) {
				return "삭제";
			}
			else {
				return "실패";
			}
		}
//		@RequestMapping("/update")
//		@ResponseBody
//		public String update(@ModelAttribute GuestbookDto dto) {
//			
//		}
//		@RequestMapping("/search")
//		@ResponseBody
//		public String search(@RequestParam String type,
//				@RequestParam String keyword) {
//			if(type.equals("name")) {
//				String sql="select * from guest_book where instr(name,?)";
//			}
//			else if (type.equals("memo"))
//		}
}
