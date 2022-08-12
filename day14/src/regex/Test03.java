package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 : ");
		String nickname = sc.next();
		sc.close();
		
		String regex = "^[가-힣0-9]{2,10}$";
		
		boolean result = Pattern.matches(regex, nickname);//왼쪽이 검사식, 오른쪽이 검사값
		
		if(result) {
			System.out.println("멋진 닉네임이네요!");
		}
		else {
			System.out.println("닉네임은 한글 또는 숫자 2~10자 내외로 작성하세요");
		}
	}
}