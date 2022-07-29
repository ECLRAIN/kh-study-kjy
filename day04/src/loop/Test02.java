package loop;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		//(주의) 도구는 반복 내에서 만들지 않는다!
				Scanner sc = new Scanner(System.in);

				System.out.println("숫자 5개를 입력하세요");
				for(int i=0; i < 5; i++) {
					int a = sc.nextInt();
				}

				sc.close();

			}
		}
