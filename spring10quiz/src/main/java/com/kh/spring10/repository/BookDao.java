package com.kh.spring10.repository;

import java.util.List;

import com.kh.spring10.entity.BookDto;

public interface BookDao {
	void insert(BookDto dto);//등록
	boolean update(BookDto dto);// 왜 불린이냐 성공 트루한지 안한지 그거에 따라 값을 다르게 반환할려고
	boolean delete(int book_serial);
	List<BookDto>selectList();//목록기능
	List<BookDto>selectList(String type, String keyword); //검색기능
	BookDto selectOne(int book_serial); //상세 기능
}
