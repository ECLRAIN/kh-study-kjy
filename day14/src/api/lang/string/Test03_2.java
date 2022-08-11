package api.lang.string;

import java.util.Scanner;

public class Test03_2 {
	public static void main(String[] args) {
		//준비
		String nickname = "테스트";
		
		//계산
		//(1) 글자 수 - .length()
		//boolean first = 글자수가 2글자 이상 10글자 이하;
		boolean first = nickname.length() >= 2 && nickname.length() <= 10;
		//System.out.println("first = " + first);
		
		//(2) 운영자의 포함 여부 - .indexOf()
		//System.out.println("indexOf = " + nickname.indexOf("운영자"));
		//System.out.println("lasIndexOf = " + nickname.lastIndexOf("운영자"));
		boolean second = nickname.indexOf("운영자") == -1;
		
		//출력
		if(first && second) {
			System.out.println("닉네임 설정 완료");
		}
		else {
			System.out.println("잘못된 닉네임입니다");
		}
	}
}
