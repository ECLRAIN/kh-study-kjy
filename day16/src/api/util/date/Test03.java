package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
	public static void main(String [] args) {
		Date a= new Date();
		//Date의 형식(Format) 바꾸기
		//-java.text.SimpleDateFormat 클래스를 사용하면 형식을 바꿀 수 있다
		
		//2022년 8월 16일 화
		//SimpleDateFormat f=new SimpleDateFormat("y년 M월 d일 E");
		Format f=new SimpleDateFormat("y년 M월 d일 E");
		System.out.println(f.format(a));
		//오후 12시 2분
		SimpleDateFormat u=new SimpleDateFormat("a h시 m분");
		System.out.println(u.format(a));
		//12:02:35
		SimpleDateFormat k=new SimpleDateFormat("HH:mm:ss");
		System.out.println(k.format(a));
		//2022-08-16 화 12:02:35
		SimpleDateFormat h=new SimpleDateFormat("y-M-d E HH:mm:ss");
		System.out.println(h.format(a));
	}
}
