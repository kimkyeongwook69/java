package step06_Exception;

//Info.class 
class Info {
	static {
		System.out.println("Info 클래스");
	}
}



public class Ex02Exception {

	public static void main(String[] args) {

		//step01 - basic
		
//		try {
//			// 클래스를 가져다가 사용하기 위해서는
//			// 클래스의 이름이 필요하다(경로 포함!!)
//			Class.forName("step06_Exception.Info");
//		} catch (ClassNotFoundException e) {
//			// Trace(): 개발시에는 필요 !! 
//			e.printStackTrace();
//		} finally {
//			System.out.println("finally");
//		}
		
		//step02 - 예외 처리 순서
		 
		// step02 - 예외 처리 순서
		try {
			// NPE
			String str1 = null;
//			System.out.println(str1.length());
			
			//--> 예외가 발생하는 순서는 지켜서 처리하는것이 좋다 
			// NumberFormatException
			String str2 = "three";
			Integer.parseInt(str2);
			
			
			//multi-catch
		} catch(NullPointerException | NumberFormatException e) {
			System.out.println("숫자 처리");
		} catch(Exception e) {
			System.out.println("공통 처리");

		}

	}
}
