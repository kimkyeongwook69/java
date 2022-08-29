package step03;

import java.util.Calendar;

public class Singleton2 {

	public static void main(String[] args) {
		
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton2.hashCode());
		
		Calendar cal = Calendar.getInstance();
	}

}
