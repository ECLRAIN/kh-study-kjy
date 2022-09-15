package loop;
//import java.lang.*;
public class Test07_1 {
	public static void main(String[] args) {
		//[2] 박수를 치는 숫자와 아닌 숫자를 구분하여 출력
		
		for(int i=1 ; i <= 99 ; i++) {
			//if(3,6,9가 있는 숫자라면) {
			//if(십의자리3 || 일의자리3 || 십의자리6 || 일의자리6 || 십의자리9 || 일의자리9) {
			boolean three = i / 10 == 3 || i % 10 == 3;
			boolean six = i / 10 == 6 || i % 10 == 6;
			boolean nine = i / 10 == 9 || i % 10 == 9;
			if(three || six || nine) {
				System.out.println("박수!");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
