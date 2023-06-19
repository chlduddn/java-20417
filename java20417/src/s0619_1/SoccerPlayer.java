package s0619_1;

public class SoccerPlayer extends Person{
	String teamName;

	@Override
	void printInfo() {
		
		super.printInfo();
		System.out.println(name+"은 "+teamName+"팀 축구선수 입니다.");
	}
	
}
