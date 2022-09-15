package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		//준비
		String userId = "khacademy";
		String userPassword = "student";
		
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
