package day05;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args) {
		// 준비
				Scanner sc = new Scanner(System.in);
				System.out.print("숫자 입력 : ");
				int number = sc.nextInt();
				sc.close();

				int count = 0;

				// 계산 - 1부터 number까지의 숫자로 나누기를 시도
				for (int i = 1; i <= number; i++) {
					//System.out.println(number + " % " + i + " = " + number % i);
					if(number % i == 0) {//number 가 i 로 나누어 떨어진다면
						//System.out.println("찾았다!");
						count++;
					}
				}

				//System.out.println("count = " + count);

				// 출력
				if(count == 2) {
					System.out.println(number + " - 소수입니다");
				}
				else {
					System.out.println(number + " - 소수가 아닙니다");
				}
			}
		}