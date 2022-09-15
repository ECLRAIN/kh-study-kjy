package update;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcUtil;

public class Test03 {
	public static void main(String[] args) {
		//update customer 
		//set customer_mileage=customer_mileage+? 
		//where customer_no=?;
		
		//데이터 준비
		int customer_no = 100;
		int customer_mileage = 300;
		
		//DB 처리
		JdbcTemplate jdbcTemplate = JdbcUtil.getTemplate();
		
		String sql = "update customer "
							+ "set customer_mileage = customer_mileage + ? "
							+ "where customer_no = ?";
		Object[] param = {customer_mileage, customer_no};
		
		int result = jdbcTemplate.update(sql, param);
		if(result > 0) {
			System.out.println("포인트 증정 완료");
		}
		else {
			System.out.println("존재하지 않는 고객 번호");
		}
	}
}







