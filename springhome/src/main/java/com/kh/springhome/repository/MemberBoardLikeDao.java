package com.kh.springhome.repository;

import com.kh.springhome.entity.MemberBoardLikeDto;

public interface MemberBoardLikeDao {
	void insert(MemberBoardLikeDto dto);
	void delete(MemberBoardLikeDto dto); //딜리트할때 기본키가 필요한데 복합으로 묶어 버려서 2개를 넣어야함 그래서 dto를 집어넣은거임
//	MemberBoardLikeDto selectOne(MemberBoardLikeDto dto);
	boolean check(MemberBoardLikeDto dto);
	int count(int boardNo);//보드 넘버를 알려줄태니 카운트해 리프레쉬 땜에 쓸모 없어지긴함
	void refresh(int boardNo);
}