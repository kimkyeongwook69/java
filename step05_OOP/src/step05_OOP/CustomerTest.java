package step05_OOP;

import model.domain.Customer;
import model.domain.GoldCustomer;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customerIT = new Customer(10001, "IT");
		
		
		//calPrice : 물품 구매 메소드 가정
		customerIT.calPrice(1000);
		System.out.println(customerIT.calPrice(1000));
		
		GoldCustomer customerDev = new GoldCustomer(10002, "DEV"); //990
		
		System.out.println(customerDev.getCustomerGrade());
		
		
		
	}
	

	
}

