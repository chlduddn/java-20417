package s0508;

public class GetSetExam {

	public static void main(String[] args) {
	Student kim = new Student();
	System.out.println(kim.getName());
	kim.setName("영우");
	kim.setGrade(3);
	kim.setScore(3);
	System.out.println(kim.getName() + "는 " + kim.getGrade() + "학년 이고,학점은" + kim.getScore() + "점이에요.");
	
	Student Numberone = new Student();
	Numberone.setName("최영우");
	Numberone.setGrade(2);
	Numberone.setScore(100);
	Numberone.printAll();
	}

}
