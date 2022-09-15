package data;
import java.lang.*;
import java.text.DecimalFormat;

public class Test14 {
	public static void main(String[] args) {
		//준비 - 신장(cm), 체중(kg)
		double height = 180;
		double weight = 80;
		
		//계산 - BMI
		//(공식) BMI = 체중(kg) / 키(m)²
		
		double heightMeter = height / 100;
		
		//double bmi = weight / 키 / 키;
		//double bmi = weight / (키 * 키);
		double bmi = weight / (heightMeter * heightMeter);
				
		//출력
		System.out.println("BMI 지수는 다음과 같습니다");
		System.out.println(bmi);
		
		//추가 : 소수점을 2자리까지만 표시
		//(1) 직접 구현
		double bmi2 = (int)(bmi * 100) / 100.0;
		System.out.println(bmi2);
		
		//(2) 라이브러리 사용
		DecimalFormat fm = new DecimalFormat("0.00");
		System.out.println(fm.format(bmi));
	}
}








