package s0619_1;

public class Major extends Book{
	String subject;

	@Override
	void printBook() {
		
		super.printBook();
		System.out.println("전공분야는" + subject + "입니다.");
	}
	
}
