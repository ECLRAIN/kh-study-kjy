package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.next();
		sc.close();
		
		String regex = "^[a-z][a-z0-9]{7,19}$";
		
		boolean result = Pattern.matches(regex, id);//왼쪽이 검사식, 오른쪽이 검사값
		
		if(result) {
			System.out.println("멋진 아이디네요!");
		}
		else {
			System.out.println("아이디는 영문 소문자로 시작하며 숫자를 포함한 8~20자 이내로 작성하세요");
		}
	}
}




