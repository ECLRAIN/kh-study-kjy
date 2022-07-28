package condition;
import java.lang.*;
public class Test09 {
	public static void main(String [] args) {
		//준비
		int Byear= 2002;
		int Nyear= 2022;
		//계산
		int age=Nyear-Byear+1;
		//출력
		if(age>=20 && age<=64) {
			System.out.println("성인: 1250원 ");
		}
		else if(age>=14 && age<=19) {
			System.out.println("청소년: 720원 ");
		}
		else if(age>=8 && age<=13) {
			System.out.println("어린이: 450원 ");
		}
		else {
			System.out.println("무료");
		}
	}
}
