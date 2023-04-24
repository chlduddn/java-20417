package s0417;

public class Studentmain {

	public static void main(String[] args) {
		Student hong = new Student();
		Student kim = new Student();
		Student lee = new Student("이지은", 20 , 2 , 789 , 48);
		
		lee.printAll();
		
		hong.age = 18;
		hong.grade = 2;
		hong.name = "최영우";
		hong.number = 20417;
		hong.printAll();
		
		kim.age = 0;
		kim.grade = 0;
		kim.name = "최랑";
		kim.number = 0;
		kim.printAll();
		

	}

}
