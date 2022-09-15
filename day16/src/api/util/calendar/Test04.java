package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
		
		//준비
		int year = 2022;
		int month = 7;
		
		//계산
		//1. 해당 월의 1일로 설정해서 무슨 요일인지를 알아야 한다
		//2. 앞에 날짜를 몇 개 더 출력해야하는지 알 수 있다
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);//1
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(d));
	}
}






