package com.kh.springhome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import com.kh.springhome.entity.BoardDto;
import com.kh.springhome.repository.BoardDao;

@SpringBootTest
public class BoardDummyTest {

	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@BeforeEach
	public void after() {
		boardDao.clear();
	}
	@Test
	public void before() {
		for(int i=1; i <= 7905; i++) {
			boardDao.insert(BoardDto.builder()
												.boardHead("유머")
												.boardTitle("테스트"+i)
												.boardContent("테스트"+i)
												.boardWriter("eclrain123")
											.build());
		}
	}

}