package loop;

import java.util.Scanner;

public class Test03 {
	public static void main(String [] args) {
		//while은 종료 시점을 알 때 유용하게 사용할 수 있다
		//자동 임포트 컨트롤 쉬프트 o
		//ex 사용자가 0입력할 때까지 숫자를 반복적으로 입력받는 프로그램
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.print("입력: ");
			int number= sc.nextInt();
			if(number==0) {
				break;
			}
			
		}
		sc.close();
	}
}
