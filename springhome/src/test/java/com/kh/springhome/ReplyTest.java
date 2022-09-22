package com.kh.springhome;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.springhome.entity.ReplyDto;
import com.kh.springhome.repository.ReplyDao;

@SpringBootTest
public class ReplyTest {
	
	@Autowired
	private ReplyDao replyDao;
	
	@BeforeEach
	public void before() {
		//insert
		for(int i=1; i <= 100; i++) {
			replyDao.insert(ReplyDto.builder()
										.replyWriter("eclrain123")
										.replyContent("댓글테스트0922"+i)
										.replyOrigin(7923)
									.build());
		}
	}
	
	@Test
	public void test() {
		//select
		List<ReplyDto> list = replyDao.selectList(1);
		for(ReplyDto replyDto : list) {
			System.out.println(replyDto);
		}
	}
	
}