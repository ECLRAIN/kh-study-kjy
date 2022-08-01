package loop;
import java.util.Scanner;
public class Test04 {
	public static void main(String [] args) {
		
		//스캐너로 받은 숫자에서 -100을 차감한다
		//입력받은숫자<0 -> "게임 오버"
		//입력한 숫자의 개수를 카운트 하시오
		Scanner sc = new Scanner(System.in);

		int total = 100;
		int count = 0;

		while(true) {
			System.out.print("숫자 입력 : ");
			int number = sc.nextInt();

			total -= number;
			//System.out.println("total = " + total);

			if(total < 0) {
				break;
			}
			else {
				count++;
			}
		}

		sc.close();

		System.out.println("Game over!");
		System.out.println("총 "+count+"번 입력하셨습니다");

	}
}
