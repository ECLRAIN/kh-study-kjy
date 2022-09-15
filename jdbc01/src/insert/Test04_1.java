package insert;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04_1 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("속성 : ");
		String type = sc.nextLine();
		sc.close();
		
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








