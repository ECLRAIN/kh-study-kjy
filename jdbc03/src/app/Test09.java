package app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import dto.Musicdto;
import util.JdbcUtil;

public class Test09 {
	public static void main(String[] args) {
		//노래 한 곳에 대한 정보만 출력
		//준비
		int musicNo=1;
		//db
		JdbcTemplate template=JdbcUtil.getTemplate();
		String sql="select * from music where music_no=?";
		Object[] param= {musicNo};
		
		ResultSetExtractor<Musicdto> extractor= new ResultSetExtractor() {

			
			public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(있다면) {
					Musicdto musicdto =new Musicdto();
					musicdto.setMusicNo(rs.getInt("musicNo"));
					return musicdto;
				}
				else {
					return null;
				}
			}
			
		};
		
	}
}
