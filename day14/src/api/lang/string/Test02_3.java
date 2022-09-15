package api.lang.string;

import java.util.Scanner;

public class Test02_3 {
	public static void main(String[] args) {
		//준비
		String[][] db = new String[][] {
			{"khacademy1", "student"},
			{"khacademy2", "student"},
			{"khacademy3", "student"},
			{"khacademy4", "student"},
			{"khacademy5", "student"},
			{"khacademy6", "student"},
			{"khacademy7", "student"},
			{"khacademy8", "student"},
			{"khacademy9", "student"},
			{"khacademy10", "student"}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String userId = sc.next();
		System.out.print("비밀번호 : ");
		String userPassword = sc.next();
		sc.close();
		
		//계산
		boolean isLogin = false;
		CHECK:for(int i=0; i < db.length; i++) {
			for(int k=0; k < db[i].length; k++) {
				if(userId.equals(db[i][0]) && userPassword.equals(db[i][1])) {
					isLogin = true;
					break CHECK;
				}
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
