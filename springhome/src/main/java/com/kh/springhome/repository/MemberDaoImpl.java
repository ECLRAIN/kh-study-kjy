package com.kh.springhome.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kh.springhome.entity.MemberDto;

@Repository
public class MemberDaoImpl implements MemberDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
//	방법 1
//	insert into member(
//			아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 
//			이메일, 우편번호, 기본주소, 상세주소)
//	values(?, ?, ?, ?, ?, ?, ?, ?, ?);
	
//	방법 2
//	insert into member(
//			아이디, 비밀번호, 닉네임, 생년월일, 전화번호, 
//			이메일, 우편번호, 기본주소, 상세주소, 포인트, 
//			등급, 가입일, 로그인일시)
//	values(?, ?, ?, ?, ?, ?, ?, ?, ?, 0, '일반', sysdate, null);
	private RowMapper<MemberDto> mapper= new RowMapper<MemberDto>() {
		
		@Override
		public MemberDto mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberDto dto= new MemberDto();
			dto.setMemberId(rs.getString("memberId"));
			dto.setMemberPw(rs.getString("memberPw"));
			dto.setMemberNick(rs.getString("memberNick"));
			dto.setMemberBirth(rs.getDate("memberBirth"));
			dto.setMemberTel(rs.getString("memberTel"));
			dto.setMemberEmail(rs.getString("memberEmail"));
			dto.setMemberPost(rs.getString("memberPost"));
			dto.setMemberBaseAddress(rs.getString("memberBaseAddress"));
			dto.setMemberDetailAddress(rs.getString("memberDetailAddress"));
			dto.setMemberPoint(rs.getInt("memberPoint"));
			dto.setMemberGrade(rs.getString("memberGrade"));
			dto.setMemberJoin(rs.getDate("memberJoin"));
			dto.setMemberLogin(rs.getDate("memberLogin"));
			return dto;
		}
	};
	
	@Override
	public void insert(MemberDto memberDto) {
		String sql = "insert into member("
								+ "member_id, member_pw, member_nick, "
								+ "member_birth, member_tel, member_email, "
								+ "member_post, member_base_address, "
								+ "member_detail_address) "
						+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Object[] param = {
			memberDto.getMemberId(), memberDto.getMemberPw(),
			memberDto.getMemberNick(), memberDto.getMemberBirth(),
			memberDto.getMemberTel(), memberDto.getMemberEmail(),
			memberDto.getMemberPost(), memberDto.getMemberBaseAddress(),
			memberDto.getMemberDetailAddress()
		};
		jdbcTemplate.update(sql, param);
	}

	@Override
	public List<MemberDto> selectList() {
		String sql="select * from member";
		return jdbcTemplate.query(sql, mapper);
	}

	@Override
	public List<MemberDto> selectList(String type, String keyword) {
		String sql="select * from member where(#1,?)>0";
		sql=sql.replace("#1", type);
		Object[] param= {keyword};
		return jdbcTemplate.query(sql, mapper,param);
	}
	
}