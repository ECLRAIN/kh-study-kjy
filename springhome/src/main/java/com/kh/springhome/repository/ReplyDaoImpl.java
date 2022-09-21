package com.kh.springhome.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.ReplyDto;
@Repository
public class ReplyDaoImpl implements ReplyDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(ReplyDto replyDto) {
		String sql="insert into reply(reply_no, reply_content, reply_writer, reply_origin "
				+ "values(reply_seq.nextval, ?, ?, ?)";
		Object[] param= {replyDto.getReplyContent(), replyDto.getReplyWriter(), 
										replyDto.getReplyOrigin()};		
		jdbcTemplate.update(sql, param);
	}

}
