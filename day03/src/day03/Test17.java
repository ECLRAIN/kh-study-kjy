package day03;
import java.lang.*;
public class Test17 {
	public static void main(String[] args) {
		//논리(boolean)
		//-판정을 위한 데이터
		//-판정의 결과는 둘 중 하나(true/false)
		//-숫자 등의 데이터를 기반으로 하여 판정을 위한 계산을 한다
		//-비교 연산: >, <, >=,<=,==,!=
		
		boolean a= false;
		System.out.println(a);
		
		int money =20000;
		int pizza = 25000;
		//boolean order = 주문이 가능한가요;
		//boolean order = money가 피자보다 크거나 같나요;
		boolean order = money >=pizza;
		System.out.println(order);
	}
}