package loop;

import java.util.Scanner;

//import java.lang.*;
public class Test04_1 {
	public static void main(String[] args) {
		
		//준비
		Scanner sc = new Scanner(System.in);
		System.out.print("분 : ");
		int minute = sc.nextInt();
		System.out.print("초 : ");
		int second = sc.nextInt();
		sc.close();
		
		//계산
		int total = minute * 60 + second;
		//System.out.println("total = " + total);
		
		//출력
		for(int i=total; i >= 0; i--) {
			//System.out.println(i+"초 남았습니다");
			System.out.println(i/60 + "분 " + i%60 + "초 남았습니다");
		}
	}
}




