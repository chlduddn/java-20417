package s0612;

public class CafeMain {

	public static void main(String[] args) {
		Cafe c1 = new Cafe();
		c1.makeTea(3);
		c1.makeTea(3,5);
		c1.makeTea(2,5,10);
		c1.printcount();
		
		Cafe c2 = new Cafe();
		c2.makeTea(4);
		c2.makeTea(2,3);
		c2.makeTea(3,2,7);
		c1.printcount();
		
		
	}

}
