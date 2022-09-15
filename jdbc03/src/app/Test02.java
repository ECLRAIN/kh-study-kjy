package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test02 {
	public static void main(String[] args) {
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("음원 타이틀: ");
		String music_title=sc.next();
		System.out.print("가수: ");
		String music_artist=sc.next();
		System.out.print("앨범: ");
		String music_album=sc.next();
		System.out.print("재생수: ");
		int music_play=sc.nextInt();
		System.out.print("발매일: ");
		String release_time=sc.next();
		
		String sql="INSERT INTO music(music_no,music_title,music_artist,music_album,music_play,release_time) "
				+ "VALUES(music_seq.nextval,?,?,?,?,?)";
		Object[] param = {music_title,music_artist,music_album,music_play,release_time};
		template.update(sql,param);
		System.out.println("완료!");
		
	}
}
