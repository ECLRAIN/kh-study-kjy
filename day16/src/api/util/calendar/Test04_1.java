package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04_1 {
	public static void main(String[] args) {
		
		//준비
		int year = 2022;
		int month = 7;
		
		//계산
		//1. 해당 월의 1일로 설정해서 무슨 요일인지를 알아야 한다
		//2. 앞에 날짜를 몇 개 더 출력해야하는지 알 수 있다
		// - 1일이 일요일이면 앞에 출력할 날짜가 0개
		// - 1일이 월요일이면 앞에 출력할 날짜가 1개
		// - 1일이 화요일이면 앞에 출력할 날짜가 2개
		// - 1일이 수요일이면 앞에 출력할 날짜가 3개
		// - 1일이 목요일이면 앞에 출력할 날짜가 4개
		// - 1일이 금요일이면 앞에 출력할 날짜가 5개
		// - 1일이 토요일이면 앞에 출력할 날짜가 6개
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);//1
		
		int week = c.get(Calendar.DAY_OF_WEEK);//2
		System.out.println("week = " + week);
		
		System.out.println("앞에 출력할 글자 개수 : " + (week-1));
		
		c.add(Calendar.DATE, -(week-1));//2번에서 계산한 날짜 수만큼 앞으로 이동
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(f.format(d));
	}
}






