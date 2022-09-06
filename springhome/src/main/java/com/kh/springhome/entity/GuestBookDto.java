package com.kh.springhome.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class GuestBookDto {
	private int no;
	private String name;
	private String memo;
	public GuestBookDto() {
		super();
	}
	@Override
	public String toString() {
		return "GuestBookDto [no=" + no + ", name=" + name + ", memo=" + memo + "]";
	}
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
}