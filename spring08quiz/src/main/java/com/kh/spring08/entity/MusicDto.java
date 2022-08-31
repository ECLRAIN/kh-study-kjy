package com.kh.spring08.entity;

import java.sql.Date;

import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


public class MusicDto {
 private int music_no;
 private String music_title;
 private String music_artist;
 private String music_album;
 private int music_play;
 private Date release_time;
 
public int getMusic_no() {
	return music_no;
}
public void setMusic_no(int music_no) {
	this.music_no = music_no;
}
public String getMusic_title() {
	return music_title;
}
public void setMusic_title(String music_title) {
	this.music_title = music_title;
}
public String getMusic_artist() {
	return music_artist;
}
public void setMusic_artist(String music_artist) {
	this.music_artist = music_artist;
}
public String getMusic_album() {
	return music_album;
}
public void setMusic_album(String music_album) {
	this.music_album = music_album;
}
public int getMusic_play() {
	return music_play;
}
public void setMusic_play(int music_play) {
	this.music_play = music_play;
}
public Date getRelease_time() {
	return release_time;
}
public void setRelease_time(Date release_time) {
	this.release_time = release_time;
}
@Override
public String toString() {
	return "MusicDto [music_no=" + music_no + ", music_title=" + music_title + ", music_artist=" + music_artist
			+ ", music_album=" + music_album + ", music_play=" + music_play + ", release_time=" + release_time + "]";
}
//RowMapper는 목록,리스트를 만들기 위한 수단이다
	private static RowMapper<MusicDto> mapper= (rs, idx)->{
		MusicDto dto=new MusicDto();
		dto.setMusic_no(rs.getInt("music_no"));
		dto.setMusic_title(rs.getString("music_title"));
		dto.setMusic_artist(rs.getString("music_artist"));
		dto.setMusic_album(rs.getString("music_album"));
		dto.setMusic_play(rs.getInt("music_play"));
		dto.setRelease_time(rs.getDate("release_time"));
		return dto;
	};
	public static RowMapper<MusicDto> getMapper(){
		return mapper;
	}
	//ResultSetExtractor 객체
		private static ResultSetExtractor<MusicDto> extractor = (rs)->{
			if(rs.next()) {
				MusicDto dto=new MusicDto();
				dto.setMusic_no(rs.getInt("music_no"));
				dto.setMusic_title(rs.getString("music_title"));
				dto.setMusic_artist(rs.getString("music_artist"));
				dto.setMusic_album(rs.getString("music_album"));
				dto.setMusic_play(rs.getInt("music_play"));
				dto.setRelease_time(rs.getDate("release_time"));
				return dto;
			}
			else {
				return null;
			}
		};
		public static ResultSetExtractor<MusicDto> getExtractor(){
			return extractor;
		}
}
