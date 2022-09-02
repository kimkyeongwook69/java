package step04.abstractex;

public class NoteBook extends Computer {

	
	@Override
	public void display() {
		System.out.println("NoteBook 화면구성");
	}

	@Override
	public void typing() {
		System.out.println("NoteBook 타이핑 가능");
		
	}
}
