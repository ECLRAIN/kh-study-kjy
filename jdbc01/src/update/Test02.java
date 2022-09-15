package update;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		//데이터 준비
		//update guest_book set name=?, memo=? where no=?
		int no = 6;
		String name = "루이지";
		String memo = "안녕하세요!";
		
		//DB 처리
		JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();
		
		String sql = "update guest_book set name=?, memo=? where no=?";
		Object[] param = {name, memo, no};
		
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			System.out.println("변경이 완료되었습니다");
		}
		else {
			System.out.println("존재하지 않는 번호입니다");
		}
		
	}
}





