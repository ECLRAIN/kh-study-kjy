package delete;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//데이터 준비
		String nation="스페인";
		//db처리
		JdbcTemplate template= JdbcUtil.getTemplate();
		String sql="delete soccer_ranking where nation=?";
		Object[] param= {nation};
		
		int result= template.update(sql,param);
		System.out.println(result);
		if(result>0) {
			System.out.println("성공적으로 삭제함");
		}
		else {
			System.out.println("실패함");
		}
		
	}
}
