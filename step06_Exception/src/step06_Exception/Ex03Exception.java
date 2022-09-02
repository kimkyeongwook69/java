package step06_Exception;

import exception.NotAdminException;

public class Ex03Exception {
	
	/* 관리자 계정 검증
	 * - 고려사항
	 * 		- 관리자인 경우 : 정상 실행
	 * 		- 관리자가 아닌 경우 : 비정상 실행
	 * 							-> Exception -> 사용자 정의 예외(Application Exception)
	 * - 사용자 정의 예외 이름 : NotAdminException 
	 */
	
	// throws의미는 checkAdmin을 호출해서 사용하는 코드에서 예외를 처리하도록 예외를 보내버리겠다는 의미!
	// 같은 의미로, main 메소드에서 호출하는 checkAdmon 에서 try~catch 문으로 예외를 반드시 처리해야 한다.!! 
	public static void checkAdmin(String id) throws NotAdminException {
		if(!id.equals("admin")) {
			// 예외 발생
//			System.out.println("관리자 계정 접속 실패");
			throw new NotAdminException("관리자 계정 접속 실패");
		}else {
			System.out.println("관리자 계정 접속 성공");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			checkAdmin("user");
		}	catch(NotAdminException e) {
			e.printStackTrace();
			
		}
		
	}

}
