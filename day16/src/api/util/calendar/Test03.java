package api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		//기념일 관리 프로그램
		Calendar c = Calendar.getInstance();
		
		//계산
		int date = c.get(Calendar.DATE);
		c.set(Calendar.DATE, date + 99);
		//c.add(Calendar.DATE, 99);
		
		//출력
		Date d = c.getTime();
		Format f = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println("100일 - " + f.format(d));
	}
}





