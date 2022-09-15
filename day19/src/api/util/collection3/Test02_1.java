package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		//저장소 생성 및 데이터 준비
		Map<String, String> database = new HashMap<>();
		
		database.put("testuser", "testuser1234");
		database.put("student", "student1234");
		database.put("admin", "admin1234");
		
		//아이디, 비밀번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		sc.close();
		
		//판정
		//boolean isLogin = 아이디 존재 && 비밀번호 일치;
		//boolean isLogin = database.containsKey(id) && database.containsValue(password);//잘못된 코드
		boolean isLogin = database.containsKey(id) 
												&& password.equals(database.get(id));
		
		//출력
		if(isLogin) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
}











