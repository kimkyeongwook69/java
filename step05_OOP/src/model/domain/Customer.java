package model.domain;

public class Customer {
	private int customerId;
	private String customerName;
	protected String customerGrade;
	
	int bonsuPoint;
	double bonusRatio;
	
	// 골드회원은 개별 상담원을 붙여준다고 가정 ! 
// String counsellerID;
	
	// step01
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		// 
	}
	// 고객이 물품 구매시 포인트를 적립하는 기능 
	
	public int calPrice(int price) {
		// 물품 구매시 보너스 비율 만큼 가격을 할인
		
		
		// 추발개발 가정 
//		if(costomerGrade == "SILVER") {
//		
//		}else if() {
//			
//		}
		
		
		price = price - (int)(price*bonusRatio);
		
		// 물품 구매시 보너스 포인트 = 가격 * 보너스 비율
		bonsuPoint += (int)price * bonusRatio;
		
		return price;
	}
	
		
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonsuPoint() {
		return bonsuPoint;
	}

	public void setBonsuPoint(int bonsuPoint) {
		this.bonsuPoint = bonsuPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public Customer(int customerId, String customerName) {
	this.customerId = customerId;
	this.customerName  = customerName;
	
	customerGrade = "SILVER";
	bonusRatio = 0.01;
	}
}



