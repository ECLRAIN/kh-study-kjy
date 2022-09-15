package app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.MusicDto;
import util.JdbcUtil;

public class Test06_2 {
	public static void main(String[] args) {
		//준비
		String keyword = "e";
		
		//DB
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from music "
							+ "where instr(upper(music_title), upper(?)) > 0 "
								+ "or instr(upper(music_artist), upper(?)) > 0 "
								+ "or instr(upper(music_album), upper(?)) > 0";
		Object[] param = {keyword, keyword, keyword};
		
		List<MusicDto> list = template.query(sql, MusicDto.getMapper(), param);
		for(MusicDto musicDto : list) {
			System.out.println(musicDto);
		}
		
	}
}













