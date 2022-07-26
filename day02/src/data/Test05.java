package data;
import java.lang.*;
public class Test05 {
		public static void main() {
			//커피숍 요금 계산
			int Americano = 1300;
			int Latte = 2000;
			int AmericanoCount = 4;
			int LatteCount = 3;
			//계산식 
			int AmericanoTotal = Americano * AmericanoCount;
			int LatteTotal = Latte * LatteCount;
			//출력
			System.out.println("총 결제 금액은 다음과 같습니다");
			System.out.println(AmericanoTotal + LatteTotal);
		}
}
