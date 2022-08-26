package select;

public class CustomerDto {
	private int CUSTOMER_NO;
	private String CUSTOMER_ID;
	private String CUSTOMER_PHONE;
	private String CUSTOMER_REGIST;
	private String CUSTOMER_PURCHASE;
	private int CUSTOMER_MILEAGE;
	private String CUSTOMER_GRADE;
	public int getCUSTOMER_NO() {
		return CUSTOMER_NO;
	}
	public void setCUSTOMER_NO(int cUSTOMER_NO) {
		CUSTOMER_NO = cUSTOMER_NO;
	}
	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}
	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}
	public String getCUSTOMER_PHONE() {
		return CUSTOMER_PHONE;
	}
	public void setCUSTOMER_PHONE(String cUSTOMER_PHONE) {
		CUSTOMER_PHONE = cUSTOMER_PHONE;
	}
	public String getCUSTOMER_REGIST() {
		return CUSTOMER_REGIST;
	}
	public void setCUSTOMER_REGIST(String cUSTOMER_REGIST) {
		CUSTOMER_REGIST = cUSTOMER_REGIST;
	}
	public String getCUSTOMER_PURCHASE() {
		return CUSTOMER_PURCHASE;
	}
	public void setCUSTOMER_PURCHASE(String cUSTOMER_PURCHASE) {
		CUSTOMER_PURCHASE = cUSTOMER_PURCHASE;
	}
	public int getCUSTOMER_MILEAGE() {
		return CUSTOMER_MILEAGE;
	}
	public void setCUSTOMER_MILEAGE(int cUSTOMER_MILEAGE) {
		CUSTOMER_MILEAGE = cUSTOMER_MILEAGE;
	}
	public String getCUSTOMER_GRADE() {
		return CUSTOMER_GRADE;
	}
	public void setCUSTOMER_GRADE(String cUSTOMER_GRADE) {
		CUSTOMER_GRADE = cUSTOMER_GRADE;
	}
	@Override
	public String toString() {
		return "CustomerDto [CUSTOMER_NO=" + CUSTOMER_NO + ", CUSTOMER_ID=" + CUSTOMER_ID + ", CUSTOMER_PHONE="
				+ CUSTOMER_PHONE + ", CUSTOMER_REGIST=" + CUSTOMER_REGIST + ", CUSTOMER_PURCHASE=" + CUSTOMER_PURCHASE
				+ ", CUSTOMER_MILEAGE=" + CUSTOMER_MILEAGE + ", CUSTOMER_GRADE=" + CUSTOMER_GRADE + "]";
	}
	
	
}
