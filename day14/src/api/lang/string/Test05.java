package api.lang.string;

import java.util.Scanner;

public class Test05 {
	public static void main(String [] args) {
		//입력
	    Scanner sc= new Scanner(System.in);
		String a="바나다가";
		System.out.println(a);
		
		System.out.print("");
		String user=sc.next();
		sc.close();
		//계산
		//System.out.println(user.charAt(0));
		//char a=a.charAt(2)
		//boolean game=a.charAt(a.length()-1)==user.charAt(0);
		//System.out.println(a.substring(a.length(3)));
//		System.out.println(a.substring(3));
//		System.out.println(a.length());
		System.out.println(user.charAt(0));
		boolean game=a.substring(a.length()-1).equals(user.charAt(0));
		
		if(game==true) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}

		
	}
}
