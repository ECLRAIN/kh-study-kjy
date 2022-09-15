package api.lang.string;

import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//준비
		String given = "바나나";
		
		while(true) {
			System.out.print(given + "! 쿵쿵따! -> ");
			String input = sc.next();
			
			boolean good = given.charAt(given.length()-1) == input.charAt(0);
			//good = good && input.length() == 3;
			good &= input.length() == 3;
			
			//출력
			if(good) {
				//System.out.println("이어져");
				given = input;//제시어 교체
			}
			else {
				//System.out.println("안이어져");
				break;
			}
		}
		
		sc.close();
		
		System.out.println("게임 오버!");
	}
}







