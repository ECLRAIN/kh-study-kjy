package app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test05 {
	public static void main(String[] args) {
		
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from music "
							+ "order by music_play desc, music_no asc";
		RowMapper<MusicDto> mapper = (rs, idx)->{
			MusicDto musicDto = new MusicDto();
			musicDto.setMusicNo(rs.getInt("music_no"));
			musicDto.setMusicTitle(rs.getString("music_title"));
			musicDto.setMusicArtist(rs.getString("music_artist"));
			musicDto.setMusicAlbum(rs.getString("music_album"));
			musicDto.setMusicPlay(rs.getInt("music_play"));
			musicDto.setReleaseTime(rs.getDate("release_time"));
			return musicDto;
		};
		
		List<MusicDto> list = template.query(sql, mapper);
		for(MusicDto musicDto : list) {
			System.out.println(musicDto);
		}
	}
}








