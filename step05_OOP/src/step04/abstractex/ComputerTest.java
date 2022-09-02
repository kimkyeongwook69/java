package step04.abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();
		noteBook.display();
		
		
		Computer computerNoteBook = new NoteBook();
		computerNoteBook.display(); // 메소드 오버라이딩 
		
		
		DeskTop deskTop = new DeskTop();
		deskTop.display();

		Computer computer = new Computer() {
			
			@Override
			void typing() {
				// TODO Auto-generated method stub
				
			}
		};

		// 생성 불가 : computer 추상 클래스 이기 때문에 객체 
		// 불가능 !! => 생성가능 하게끔 하려면
		// 내부에 있는 추상 메소드가 완전히 정의가 되어야먄 객체 
		// 생성이 가능함 

	}

}
