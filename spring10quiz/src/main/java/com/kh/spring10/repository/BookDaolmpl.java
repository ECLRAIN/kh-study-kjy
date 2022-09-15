package com.kh.spring10.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.spring10.entity.BookDto;


//dao의 본체
@Repository
public class BookDaolmpl implements BookDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private RowMapper<BookDto>mapper= new RowMapper<BookDto>() {
		
		@Override
		public BookDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BookDto dto= new BookDto();
			dto.setBook_serial(rowNum);
			return null;
		}
	};
	
	@Override
	public void insert(BookDto dto) {
		String sql="insert into book(book_serial, book_name, book_writer, "
				+ "book_publisher, book_price, book_genre, creation_time) "
				+ "values(book_seq.nextval, ?, ?, ?, ?, sysdate)";
		Object[] param= {dto.getBook_name(), dto.getBook_writer(), dto.getBook_publisher(), 
				dto.getBook_price(), dto.getBook_genre(),dto.getCreation_time()};
		jdbcTemplate.update(sql,param);
		
	}

	@Override
	public boolean update(BookDto dto) {
		String sql="update book set book_name=? book_writer=? book_publisher=? book_price=? book_genre=? creation_time=?"
				+ "where book_serial=?";
		Object[] param= {dto.getBook_name(), dto.getBook_writer(), dto.getBook_publisher(), 
				dto.getBook_price(), dto.getBook_genre(),dto.getCreation_time(),dto.getBook_serial()};
		int result=jdbcTemplate.update(sql,param);
		return result>0;
	}

	@Override
	public boolean delete(int book_serial) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookDto> selectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDto> selectList(String type, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDto selectOne(int book_serial) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
