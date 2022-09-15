package loop;
//import java.lang.*;
import java.util.Scanner;
public class Test10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i <= 10; i++) {
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			
			if(a % 2 == 1) {//홀수
				System.out.println("홀수입니다");
			}
			else {//짝수
				System.out.println("짝수입니다");
			}
		}
		
		sc.close();
	}
}












