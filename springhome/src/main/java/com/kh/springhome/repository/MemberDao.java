package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.MemberDto;

public interface MemberDao {
	void insert(MemberDto memberDto);
	List<MemberDto> selectList();
	List<MemberDto> selectList(String type, String keyword);
	MemberDto selectOne(String memberId);
	boolean update(MemberDto memberDto);
	boolean delete(String memberId);
	boolean changePassword(String memberId, String memberPw);
}
