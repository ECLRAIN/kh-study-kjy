package select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql= "select * FROM customer";
		
		RowMapper<CustomerDto> mapper = (rs, idx)-> {
			
			CustomerDto DTO = new CustomerDto();
			DTO.setCUSTOMER_NO(rs.getInt("CUSTOMER_NO"));
			DTO.setCUSTOMER_ID(rs.getString("CUSTOMER_ID"));
			DTO.setCUSTOMER_PHONE(rs.getString("CUSTOMER_PHONE"));
			DTO.setCUSTOMER_REGIST(rs.getString("CUSTOMER_REGIST"));
			DTO.setCUSTOMER_PURCHASE(rs.getString("CUSTOMER_PURCHASE"));
			DTO.setCUSTOMER_MILEAGE(rs.getInt("CUSTOMER_MILEAGE"));
			DTO.setCUSTOMER_GRADE(rs.getString("CUSTOMER_GRADE"));
			return DTO;
		};
		List<CustomerDto> list = template.query(sql, mapper);
		for(CustomerDto DTO : list) {
			System.out.println(DTO.getCUSTOMER_NO());
			System.out.println(DTO.getCUSTOMER_ID());
			System.out.println(DTO.getCUSTOMER_PHONE());
			System.out.println(DTO.getCUSTOMER_REGIST());
			System.out.println(DTO.getCUSTOMER_PURCHASE());
			System.out.println(DTO.getCUSTOMER_MILEAGE());
			System.out.println(DTO.getCUSTOMER_GRADE());
		}
	}
}
