package s0515;

public class ITEMMAIN {
	public static void main(String[] args) {
	ITEM phone = new ITEM("갤럭시 S23+");
	phone.price = 1230000;
	phone.printITEMInfo();
	
	ITEM phone2 = new ITEM("Iphone 15",1500);
	phone2.printITEMInfo();
	
	ITEM ram = new  ITEM("DDR5",200);
	ram.printITEMInfo();
	}
}
