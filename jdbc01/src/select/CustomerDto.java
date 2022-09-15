package select;

public class CustomerDto {
	private int customerNo;
	private String customerId;
	private String customerPhone;
	private String customerRegist;
	private String customerPurchase;
	private long customerMileage;
	private String customerGrade;
	@Override
	public String toString() {
		return "CustomerDto [customerNo=" + customerNo + ", customerId=" + customerId + ", customerPhone="
				+ customerPhone + ", customerRegist=" + customerRegist + ", customerPurchase=" + customerPurchase
				+ ", customerMileage=" + customerMileage + ", customerGrade=" + customerGrade + "]";
	}
	public CustomerDto() {
		super();
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerRegist() {
		return customerRegist;
	}
	public void setCustomerRegist(String customerRegist) {
		this.customerRegist = customerRegist;
	}
	public String getCustomerPurchase() {
		return customerPurchase;
	}
	public void setCustomerPurchase(String customerPurchase) {
		this.customerPurchase = customerPurchase;
	}
	public long getCustomerMileage() {
		return customerMileage;
	}
	public void setCustomerMileage(long customerMileage) {
		this.customerMileage = customerMileage;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
