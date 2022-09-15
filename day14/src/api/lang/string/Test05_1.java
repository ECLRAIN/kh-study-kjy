package api.lang.string;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		//준비
		String given = "바나나";
		
		Scanner sc = new Scanner(System.in);
		System.out.print(given + "! 쿵쿵따! -> ");
		String input = sc.next();
		sc.close();
		
		boolean good = given.charAt(given.length()-1) == input.charAt(0);
		
		//출력
		if(good) {
			System.out.println("이어져");
		}
		else {
			System.out.println("안이어져");
		}
	}
}







