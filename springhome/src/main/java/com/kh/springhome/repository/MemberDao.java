package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.MemberDto;

public interface MemberDao {
	void insert(MemberDto memberDto);
	List<MemberDto> selectList(); //일반 목록
	List<MemberDto> selectList(String type, String keyword); 
}