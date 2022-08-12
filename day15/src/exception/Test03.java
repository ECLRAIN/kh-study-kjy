package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String []args) {
		//예외 exception
		//예상치 못한 돌발상황
		//java.util.InputMismatchException
		//java.lang.Arihe
		
		try{Scanner sc=new Scanner(System.in); //아무 문제 없을 때 실행될 코드 플랜 A
		System.out.print("술값: ");
		int total= sc.nextInt();
		
		System.out.print("인원: ");
		int people= sc.nextInt();
		
		sc.close();
		int price=total/people;
		int etc=total%people;
		
		System.out.println("1인당"+price+"원");
		System.out.println("자투리"+etc+"원");
		}
		
		catch(Exception e) {//Exception에 대한 플랜 b
//			System.err.println();//에러 발생
//			System.err.println(e);
//			System.out.println(e.getClass()); //예외 클래스 정보
//			System.out.println(e.getMessage()); //예외 클래스 정보
			//예외 메세지 정보들이고 사용자에게 보여줄 만한 정보, 없을 수도 있음
			//구분을 원한다면 instanceof 대신 catch를 하나 더 만드는 것이 좋다
		if(e.getMessage()==null) {
			System.err.println("오류발생");
		}
		else {
			System.err.println("오류발생: "+e.getMessage());
		}
		//예외 처리를 하지 않은 것처럼 stack trace를 출력하고 싶을 수도 있다
		e.printStackTrace();
		}
		

	}
}
