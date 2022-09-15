package select;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test04 {
	public static void main(String[] args) {
		//SELECT는 INSERT, UPDATE, DELETE와 같은 방법으로는 사용 불가
		//(추가) 
		//- 테이블을 객체 형태로 변환해서 List 로 추출해야 한다
		//- 자바는 테이블의 한 줄이 어떻게 객체에 추가되어야 하는지를 모른다
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from soccer_ranking";
		
		//변경 방법이 작성된 객체를 구현 - RowMapper 클래스 사용
		RowMapper<Country> mapper = (rs, idx)-> {
			Country c = new Country();
			c.setRank(rs.getInt("rank"));
			c.setNation(rs.getString("nation"));
			c.setScore(rs.getDouble("score"));
			return c;
		};
		
		List<Country> list = template.query(sql, mapper);
		for(Country c : list) {
			//System.out.println(c);
			System.out.println(c.getRank());
			System.out.println(c.getNation());
			System.out.println(c.getScore());
		}
	}
}









