package s0515;

public class ITEM {
	//상품을 관리하는 클래스
	//상품 이름,가격
	
	String name;
	int	   price;
	
	//생성자
	ITEM(){
		
	}
	ITEM(String str){
		name = "제품명:" + str; //초기화
	}
	
	ITEM(String name , int price){
		this.name = "제품명:" + name; //초기화
		this.price = price*1000;
	}
	
	//메소드
	void printITEMInfo(){
		System.out.println(name + "\n출고가:"+ price);
		System.out.println("-----------------");
	}

}
