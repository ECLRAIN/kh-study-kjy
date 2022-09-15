package insert;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04 {
	public static void main(String[] args) {
		//준비
		int no = 3;
		String name = "이상해꽃";
		String type = "풀";
		
		//DB처리
		DriverManagerDataSource dataSource 
									= new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("khacademy");
		dataSource.setPassword("khacademy");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into pocket_monster(no,name,type) values(?, ?, ?)";
		Object[] param = {no, name, type};
		
		template.update(sql, param);
		
		System.out.println("완료!");
	}
}








