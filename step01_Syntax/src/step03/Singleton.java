/* 싱글톤 패턴(Singleton Pattern)
	- 하나의 객체만 만들어서 내부적인 메소드 혹은 정보를 사용하는 경우
	- 자원 절약 가능
	프린터 드라이버
		여러 컴퓨터에서 프린터 한대를 공유하는 경우
		하나를 끝내고 다음 작업을 하는 것이 아닌 동시에 섞여 나오면 안될 것임.
		Singleton 패턴: 여러 클라이언트(컴퓨터)가 동일 객체(공유 프린터)를 사용하지만 한 개의 객체(프린트 명령을 받은 출력물)가 
		유일하도록 상위 객체가 보장하도록 하는 것
		동일한 자원이나 데이터를 처리하는 객체가 불필요하게 여러 개 만들어질 필요가 없는 경우에 주로 사용
 */

package step03;

public class Singleton {
	// private 멤버변수 : 외부의 접근 제한   
	private static Singleton instance = new Singleton();
	
	// private 생성자 : 외부에서 객체 생성 방지 
	private Singleton() {}
	
	// public 메소드 : 내부에서 생성된 객체를 호출 가능 
	public static Singleton getInstance() {
		return instance;
	}

}
