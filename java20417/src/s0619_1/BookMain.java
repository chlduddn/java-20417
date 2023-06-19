package s0619_1;

public class BookMain {

	public static void main(String[] args) {
		
		Cartoon c1 = new Cartoon();
		c1.title = "순정만화";
		c1.writer = "강풀";
		c1.webtoon = true;
		c1.printBook();
		
		Major c2 = new Major();
		c2.title = "자바의정석";
		c2.writer = "남궁성";
		c2.subject = "프로그래밍";
		c2.printBook();
		
	}

}
