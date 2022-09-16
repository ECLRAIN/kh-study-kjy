package com.kh.springhome.repository;

import java.util.List;

import com.kh.springhome.entity.BoardDto;


public interface BoardDao {
	void write(BoardDto boardDto);
	List<BoardDto> selectList();
	List<BoardDto> selectList(String type, String keyword);
	BoardDto selectOne(int boardNo);
}
