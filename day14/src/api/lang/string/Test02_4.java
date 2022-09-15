package api.lang.string;

import java.util.Scanner;

public class Test02_4 {
	public static void main(String[] args) {
		//준비
		Member[] db = new Member[] {
			new Member("khacademy1", "student"),
			new Member("khacademy2", "student"),
			new Member("khacademy3", "student"),
			new Member("khacademy4", "student"),
			new Member("khacademy5", "student"),
			new Member("khacademy6", "student"),
			new Member("khacademy7", "student"),
			new Member("khacademy8", "student"),
			new Member("khacademy9", "student"),
			new Member("khacademy10", "student")
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPassword = sc.next();
		sc.close();
		
		Member user = new Member(userId, userPassword);
		
		//계산
		boolean isLogin = false;
		for(int i=0; i < db.length; i++) {
			if(db[i].equals(user)) {
				isLogin = true;
				break;
			}
		}
		
		//출력
		if(isLogin) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 불가");
		}
	}
}
