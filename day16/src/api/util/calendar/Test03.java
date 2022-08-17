package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String [] args) {
		//오늘로부터 100일 뒤가 몇일인지 계산후에 출력

		Calendar c = Calendar.getInstance();
		//System.out.println(c);
		
		//int date=c.get(Calendar.DATE);
		//c.set(Calendar.DATE, date+99);
		
		c.add(Calendar.DATE, 99);
//		int day = c.get(Calendar.DAY_OF_MONTH);
//		System.out.println(day+100);
		
		Date d = c.getTime();
//		Format f1 = new SimpleDateFormat("yyyy-MM-dd");
//		System.out.println(f1.format(d));
		Format f2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(f2.format(d));
	}
}
