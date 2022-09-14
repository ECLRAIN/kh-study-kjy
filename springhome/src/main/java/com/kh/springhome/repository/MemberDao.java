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
	boolean changeInformation(MemberDto memberDto);//스트링으로 아이디만 받는게 좋은지 dto를 받는게 좋은지 모르겠다 아이디  주소(3개) 전화번호 닉네임 생일 dto는 뭉탱이로 변경을 하겠다 String memberId 같은건 id를 변경하겠다
	
}
