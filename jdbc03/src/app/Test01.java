package app;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test01 {
	public static void main(String[] args) {
		//등록 프로그램
		//사용자에게 입력받을 데이터 - 타이틀,가수,앨범명,발매일
		String musicTitle = "Pink Venom";
		String musicArtist = "BLACKPINK";
		String musicAlbum = "Pink Venom";
		String releaseTime = "2022-08-26";
		
		//DB 처리
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "insert into music("
								+ "music_no, music_title, music_artist, "
								+ "music_album, music_play, release_time"
							+ ") "
							+ "values(music_seq.nextval, ?, ?, ?, 0, to_date(?, 'YYYY-MM-DD'))";
		Object[] param = {musicTitle, musicArtist, musicAlbum, releaseTime};
		
		template.update(sql, param);
		System.out.println("등록 완료");
	}
}
