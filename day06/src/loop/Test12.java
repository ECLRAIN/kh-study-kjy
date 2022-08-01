package loop;

import java.util.Random;
import java.util.Scanner;

public class Test12 {
	public static void main(String [] args) {
		Random r= new Random();
		Scanner sc= new Scanner(System.in);
		//정답 생성
		int com= r.nextInt(1000)+1;
		System.out.println(com);
		int count = 0;
		while(true) {
		System.out.print("입력: ");
		int user=sc.nextInt();
		count++;
		if(com>user) {
			System.out.println("업");
		}
		else if(com<user) {
			System.out.println("다운");
		}
		else {
			System.out.println("정답");
			break;
		}
		}
		sc.close();
		System.out.println(count+"번 만에 맞췄음");
	}
}
