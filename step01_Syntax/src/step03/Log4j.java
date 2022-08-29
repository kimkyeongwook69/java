package step03;

// 시스템 로그 기록과 관련되어있는 클래스 예제
public class Log4j {
	
	
	//Log4j클래스 -> 싱클톤 패턴 적용
	
	private static Log4j instance = new Log4j();
			
			
	private Log4j() {}

	public static Log4j getInstanece() {
		return instance;
	}
	
	
	public String info() {
		return "알림 : 관리자 접급";
	}
	
	public String warn() {
		return "경고 : 접급 불까";
	}

}
