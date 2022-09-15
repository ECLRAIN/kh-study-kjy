package insert;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//insert into guest_book(no, name, memo)
		//values(guest_book_seq.nextval, '테스트', '테스트내용');
		
		//준비
		String name = "피카츄";
		String memo = "피카~~~~";
		
		//DB처리
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("khacademy");
		dataSource.setPassword("khacademy");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "insert into guest_book(no, name, memo) "
								+ "values(guest_book_seq.nextval, ?, ?)";
		Object[] param = {name, memo};
		
		template.update(sql, param);
		
		System.out.println("완료!");
	}
}







