package com.kh.spring12;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class Test02 {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//테스트 메소드는 반드시 void 반환형을 가지고 매개변수는 없어야 한다
	@Test
	public void basic02() {
		int no= 55;
		String name="피카츄";
		String type="전기";
		
		String sql="insert ino pocket_monster(no,name,type) values(?,?,?)";
		Object [] param = {no, name, type};
		jdbcTemplate.update(sql,param);
	}
}
