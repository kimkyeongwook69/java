package model.domain;


/*	할인가격은 제품가격의 10*
 *  보너스 포인트 적립은 제품 가격의 5%
 *  개별 상담원 예정
 */ 
public class GoldCustomer extends Customer{
	String counsellerId;
	
	
	public GoldCustomer() {
		
		customerGrade = "GOLD";
		bonusRatio = 0.05;
	}
	
	
	
	
	
	
	
	
	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.05;
	}
}
	
