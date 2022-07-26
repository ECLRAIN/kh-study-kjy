package data;
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		//준비 1L=1920
		int gasprice =1920;
		int property = 50000;
		//계산
		float liter = (float)property / gasprice;
		//출력
		System.out.println("주유 가능한 용량");
		System.out.println(liter);
	}
}
