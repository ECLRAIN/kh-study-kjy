package select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import util.JdbcUtil;

public class Test06 {
	public static void main(String[] args) {
		JdbcTemplate template = JdbcUtil.getTemplate();
		
		String sql = "select * from customer order by customer_no asc";
		RowMapper<CustomerDto> mapper = (rs, idx)->{
			CustomerDto customerDto = new CustomerDto();
			customerDto.setCustomerNo(rs.getInt("customer_no"));
			customerDto.setCustomerId(rs.getString("customer_id"));
			customerDto.setCustomerPhone(rs.getString("customer_phone"));
			customerDto.setCustomerRegist(rs.getString("customer_regist"));
			customerDto.setCustomerPurchase(rs.getString("customer_purchase"));;
			customerDto.setCustomerMileage(rs.getLong("customer_mileage"));
			customerDto.setCustomerGrade(rs.getString("customer_grade"));
			return customerDto;
		};
		
		List<CustomerDto> list = template.query(sql, mapper);
		for(CustomerDto customerDto : list) {
			System.out.println(customerDto);
		}
	}
}








