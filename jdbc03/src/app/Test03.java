package app;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		//준비
		int musicNo = 1;
		
		//DB
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "update music "
							+ "set music_play = music_play + 1 "
							+ "where music_no = ?";
		Object[] param = {musicNo};
		
		int result = template.update(sql, param);
		if(result > 0) {
			System.out.println("재생 성공");
		}
		else {
			System.out.println("존재하지 않는 음원 번호");
		}
	}
}







