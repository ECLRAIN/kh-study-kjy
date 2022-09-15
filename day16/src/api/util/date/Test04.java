package api.util.date;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;

public class Test04 {
	public static void main(String[] args) {
		//숫자 형식 제어
		//- 0은 해당 자리에 숫자가 없으면 그 자리에 0을 출력(자리를 고정하는 역할)
		//- #은 해당 자리에 숫자가 없으면 출력하지 않음
		//- 패턴을 인식하므로 콤마는 하나만 작성해도 된다
		
		int a = 1234567890;
		double b = 1234.567890;
		
		Format f1 = new DecimalFormat("0,000,000,000");
		System.out.println(f1.format(a));
		System.out.println(f1.format(b));
		
		Format f2 = new DecimalFormat("#,###,###,###");
		System.out.println(f2.format(a));
		System.out.println(f2.format(b));
		
		Format f3 = new DecimalFormat("#,##0.00");
		System.out.println(f3.format(a));
		System.out.println(f3.format(b));
		System.out.println(f3.format(0.12));
		
//		올림, 버림, 반올림 등을 선택하고 싶은 경우 생성된 format에 모드를 설정한다
		DecimalFormat f4 = new DecimalFormat("#,##0.00");
//		f4.setRoundingMode(RoundingMode.CEILING);//올림모드
//		f4.setRoundingMode(RoundingMode.FLOOR);//버림모드
		f4.setRoundingMode(RoundingMode.HALF_UP);//반올림모드
		System.out.println(f4.format(b));
		System.out.println(f4.format(0.134));
	}
}







