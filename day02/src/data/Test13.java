package data;
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		
		//준비
		int money = 50000;
		int pricePerLiter = 1920;
		
		//계산
		//int liter = money / pricePerLiter;
		//float liter = (float)money / pricePerLiter;
		double liter = (double)money / pricePerLiter;
		
		//출력
		System.out.println("주유 가능한 용량");
		System.out.println(liter);
	}
}
