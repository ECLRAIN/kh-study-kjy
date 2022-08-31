package com.kh.spring07.entity;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class GuestbookDto {
	private int no;
	private String name;
	private String memo;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "GuestbookDto [no=" + no + ", name=" + name + ", memo=" + memo + "]";
	}
	//RowMapper=목록
	private static RowMapper<GuestbookDto> mapper= (rs, idx)->{
		GuestbookDto dto=new GuestbookDto();
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getString("name"));
		dto.setMemo(rs.getString("type"));
		return dto;
	};
	public static RowMapper<GuestbookDto> getMapper(){
		return mapper;
	}
	//ResultSetExtractor 객체
	private static ResultSetExtractor<GuestbookDto> extractor = (rs)->{
		if(rs.next()) {
			GuestbookDto dto=new GuestbookDto();
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setMemo(rs.getString("type"));
			return dto;
		}
		else {
			return null;
		}
	};
	public static ResultSetExtractor<GuestbookDto> getExtractor(){
		return extractor;
	}
}

