package step04.abstractex;

public class DeskTop extends Computer  {

	
	@Override
	public void display() {
		System.out.println("DeskTop 화면구성");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop 타이핑 가능");
	}
}
