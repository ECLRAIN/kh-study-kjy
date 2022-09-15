package update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02_1 {
	public static void main(String[] args) {
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 : ");
		int no = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println("내용 : ");
		String memo = sc.nextLine();
		sc.close();
		
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





