package day05;

import java.util.Scanner;

//import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//타이머 만들기
		//2분 10초
		Scanner sc = new Scanner(System.in);
		System.out.println();
		int minute=sc.nextInt();
		
		System.out.println();
		int sec=sc.nextInt();
		sc.close();
		//계산
		int total= minute*60+sec;
		System.out.println("total ="+total);
		//출력
		for(int i=total ; i>=0; i--) {
		//System.out.println("2분 10초 남았습니다");
		System.out.println(i/60+"분"+i%60+"초 남았습니다");
		}
	}
}
