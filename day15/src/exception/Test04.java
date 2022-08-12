package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {
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
		//catch(RuntimeException e) {//RuntimeException에 대한 플랜 b
		//catch(Exception e) {//Exception에 대한 플랜 b
		catch(Throwable e) {//Throwable에 대한 플랜 b
		//	catch(Object e) {//Object 에 대한 플랜 b
			System.err.println("에러 발생");	
		}
		

	}
}
