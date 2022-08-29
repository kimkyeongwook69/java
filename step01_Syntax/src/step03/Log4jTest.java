package step03;

public class Log4jTest {
	public static void main(String[] args) {
//		Log4j log = new Log4j();
		Log4j log = Log4j. getInstanece();
		
		String admin = "admin";
		String user = "it";
				
		
		if(user.equals(admin))
		{
			log.info();
		} else {
			log.warn();	
		}

	}
}
