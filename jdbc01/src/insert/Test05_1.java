package insert;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05_1 {
	public static void main(String[] args) {
		//insert into guest_book(no, name, memo)
		//values(guest_book_seq.nextval, '테스트', '테스트내용');
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 작성 : ");
		String name = sc.nextLine();
		System.out.println("내용 작성 : ");
		String memo = sc.nextLine();
		sc.close();
		
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







