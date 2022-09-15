package api.lang.string;

import java.util.Scanner;

public class Test02_2 {
	public static void main(String[] args) {
		//준비
		Member admin = new Member("khacademy", "student");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPassword = sc.next();
		sc.close();
		
		Member user = new Member(userId, userPassword);
		
		//계산
		//boolean isLogin = user.getId().equals(admin.getId()) && user.getPassword().equals(admin.getPassword());
		boolean isLogin = admin.equals(user);
		
		//출력
		if(isLogin) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 불가");
		}
	}
}
