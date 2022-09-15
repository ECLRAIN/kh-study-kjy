package insert;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		//목표 khacademy계정의 soccer_ranking테이블 데이터 insert
		//jdbc java database connectivity)
		//구문 insert into soccer_ranking(rank, nation, score)
		//values(4,'아르헨티나',1770.65)
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름:");
		String name=sc.next();
		System.out.print("메모:");
		String memo=sc.next();
		
//		1로그인을 도와주는 도구를 생성 (스프링 제공)
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("khacademy");
		dataSource.setPassword("khacademy");
		
//		2 구문 실행 도구 생성 스프링이 제공해줌
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
//		3 구문 생성
		String sql = "insert into guest_book(no, name, memo) "
				+ "values(guest_book_seq.nextval, ?, ?)";
		Object[] param = {name, memo};
		
//		3 실행
		template.update(sql,param);
		System.out.println("완료!");
		
	}
}
