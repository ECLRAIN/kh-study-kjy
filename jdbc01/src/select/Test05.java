package select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
//	클래스명은 GuestBookDto
//	필드명은 데이터베이스 컬럼명과 동일하게 작성하세요
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql= "select * FROM guest_book order by no asc";
		
		RowMapper<GuestBookDto> mapper = (rs, idx)-> {
			
			GuestBookDto GB = new GuestBookDto();
			GB.setNo(rs.getInt("no"));
			GB.setName(rs.getString("name"));
			GB.setMemo(rs.getString("memo"));
			return GB;
		};
		List<GuestBookDto> list=template.query(sql, mapper);
		for(GuestBookDto GB : list) {
			System.out.println(GB.getNo());
			System.out.println(GB.getName());
			System.out.println(GB.getMemo());
		}
	}
}
