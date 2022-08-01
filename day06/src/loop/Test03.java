package loop;

import java.util.Scanner;

public class Test03 {
	public static void main(String [] args) {
		//while은 종료 시점을 알 때 유용하게 사용할 수 있다
		//자동 임포트 컨트롤 쉬프트 o
		//ex 사용자가 0입력할 때까지 숫자를 반복적으로 입력받는 프로그램
		//사용자에게 숫자를 입력받아서 입력한 숫자만큼 100에서 차감을 합니다
		//계속적으로 입력받아서 감소시키다가 숫자가 음수가 되면 게임 오버 메세지를 띄우고 종료
		//게임 오버 전까지 입력한 숫자의 개수를 출력해보세요
		
		
		Scanner sc= new Scanner(System.in);
		int count=0;
		int total=100;
		
		while(true) {
			System.out.println();
			int number =sc.nextInt();
			total-=number;
					
		}
		
		sc.close();
	}
}
