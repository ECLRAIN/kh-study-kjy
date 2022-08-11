package api.lang.string;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPassword = sc.next();
		sc.close();
		
		//계산
		//boolean isLogin = 아이디가 khacademy이고 비밀번호가 student인가요?;
		//boolean isLogin = userId == "khacademy" && userPassword == "student";
		boolean isLogin = userId.equals("khacademy") && userPassword.equals("student");
		
		//출력
		if(isLogin == true) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 불가");
		}
	}
}