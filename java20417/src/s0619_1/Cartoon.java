package s0619_1;

public class Cartoon extends Book{
	boolean webtoon;
	
	@Override
	void printBook() {
	super.printBook();
	if(webtoon==true)
		System.out.println("이 만화는 웹툰입니다.");
	else
		System.out.println("이 만화는 웹툰이 아닙니다.");
	}
	
	
}
