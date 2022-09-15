package dto;

import java.sql.Date;

import org.springframework.jdbc.core.RowMapper;

public class MusicDto {
	private int musicNo;
	private String musicTitle;
	private String musicArtist;
	private String musicAlbum;
	private int musicPlay;
//	private String releaseTime;
	private Date releaseTime;
	public int getMusicNo() {
		return musicNo;
	}
	public void setMusicNo(int musicNo) {
		this.musicNo = musicNo;
	}
	public String getMusicTitle() {
		return musicTitle;
	}
	public void setMusicTitle(String musicTitle) {
		this.musicTitle = musicTitle;
	}
	public String getMusicArtist() {
		return musicArtist;
	}
	public void setMusicArtist(String musicArtist) {
		this.musicArtist = musicArtist;
	}
	public String getMusicAlbum() {
		return musicAlbum;
	}
	public void setMusicAlbum(String musicAlbum) {
		this.musicAlbum = musicAlbum;
	}
	public int getMusicPlay() {
		return musicPlay;
	}
	public void setMusicPlay(int musicPlay) {
		this.musicPlay = musicPlay;
	}
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	@Override
	public String toString() {
		return "MusicDto [musicNo=" + musicNo + ", musicTitle=" + musicTitle + ", musicArtist=" + musicArtist
				+ ", musicAlbum=" + musicAlbum + ", musicPlay=" + musicPlay + ", releaseTime=" + releaseTime + "]";
	}
	public MusicDto() {
		super();
	}
	
	private static RowMapper<MusicDto> mapper = (rs, idx)->{
		MusicDto musicDto = new MusicDto();
		musicDto.setMusicNo(rs.getInt("music_no"));
		musicDto.setMusicTitle(rs.getString("music_title"));
		musicDto.setMusicArtist(rs.getString("music_artist"));
		musicDto.setMusicAlbum(rs.getString("music_album"));
		musicDto.setMusicPlay(rs.getInt("music_play"));
		musicDto.setReleaseTime(rs.getDate("release_time"));
		return musicDto;
	};
	public static RowMapper<MusicDto> getMapper() {
		return mapper;
	}
}
