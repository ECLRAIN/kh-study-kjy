package com.kh.spring10.repository;

import java.util.List;

import com.kh.spring10.entity.BookDto;

public interface BookDao {
	void insert(BookDto bookDto);
	boolean update(BookDto bookDto);
	boolean delete(int bookSerial);
	List<BookDto> selectList();
	List<BookDto> selectList(String type, String keyword);
	BookDto selectOne(int bookSerial);
}
