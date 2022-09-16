package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.BoardDto;




@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<BoardDto> mapper = new RowMapper<BoardDto>() {
		
		@Override
		public BoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardDto dto= new BoardDto();
			dto.setBoardNo(rs.getInt("board_no"));
			dto.setBoardWiter(rs.getString("board_writer"));
			dto.setBoardTitle(rs.getString("board_title"));
			dto.setBoardContent(rs.getString("board_content"));
			dto.setBoardWriteTime(rs.getDate("board_writetime"));
			dto.setBoardUpdateTime(rs.getDate("board_updatetime"));
			dto.setBoardRead(rs.getInt("board_read"));
			dto.setBoardLike(rs.getInt("board_like"));
			dto.setBoardHead(rs.getString("board_head"));
			return dto;
		}
	};
	private ResultSetExtractor<BoardDto> extractor = new ResultSetExtractor<BoardDto>() {
		@Override
		public BoardDto extractData(ResultSet rs) throws SQLException, DataAccessException {
			if(rs.next()) {
				BoardDto dto= new BoardDto();
				dto.setBoardNo(rs.getInt("board_no"));
				dto.setBoardWiter(rs.getString("board_writer"));
				dto.setBoardTitle(rs.getString("board_title"));
				dto.setBoardContent(rs.getString("board_content"));
				dto.setBoardWriteTime(rs.getDate("board_writetime"));
				dto.setBoardUpdateTime(rs.getDate("board_updatetime"));
				dto.setBoardRead(rs.getInt("board_read"));
				dto.setBoardLike(rs.getInt("board_like"));
				dto.setBoardHead(rs.getString("board_head"));
				return dto;
			}
			else {
				return null;
			}
		}
		
	};
	@Override
	public void write(BoardDto boardDto) {
		String sql="insert into board(board_no, board_writer, "
				+ "board_title, board_content, board_writetime, board_updatetime, board_read, "
				+ "board_like, board_head) "
				+ "values(board_seq.nextval,?,?,?,sysdate,null,0,0,?)";
		Object[] param= {boardDto.getBoardWiter(),boardDto.getBoardTitle(),
										boardDto.getBoardContent(),boardDto.getBoardHead()};
		jdbcTemplate.update(sql,param);
//		작성자 
//		제목
//		내용
//		카테고리
	}
	
	@Override
	public List<BoardDto> selectList() {
		String sql="select * from board order by board_no asc";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<BoardDto> selectList(String type, String keyword) {
		String sql="select * from board "
				+ "where instr("+type+", ?) > 0 "
				+ "order by "+type+" asc";
		Object[] param= {keyword};
		return jdbcTemplate.query(sql, mapper, param);
	}

	@Override
	public BoardDto selectOne(int boardNo) {
		String sql="select * from board where board_no=?";
		Object[] param = {boardNo};
		return jdbcTemplate.query(sql, extractor, param);
	}

}
