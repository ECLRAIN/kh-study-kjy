package com.kh.spring09.repository;

import java.util.List;

import com.kh.spring09.entity.GuestBookDto;

public interface GuestBookDao {
		void insert(GuestBookDto dto); //등록
		boolean update(GuestBookDto dto);// 수정
		boolean delete(int no); //삭제 기능
		List<GuestBookDto> selectList(); //목록기능
		List<GuestBookDto> selectList(String type, String keyword);// 검색기능
		GuestBookDto selectOne(int no); //상세 기능
}
