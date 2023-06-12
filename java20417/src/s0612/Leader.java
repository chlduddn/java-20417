package s0612;

public class Leader extends Student {
	boolean lead;
	Leader(boolean lead) {
		this.lead = lead;
	}
	Leader(String name,String hakbun,boolean lead){
		super(name,hakbun);
		this.lead = lead;
	}
	
	//메소드
	void isLeader(){
		if(lead==true)
			System.out.println(name + "은 학급회장이다.");
		else
			System.out.println(name + "은 학급회장이아니다.");
	}
}
