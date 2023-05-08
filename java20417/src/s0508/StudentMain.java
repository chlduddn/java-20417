package s0508;

public class StudentMain {

	public static void main(String[] args) {
		
		Student kim = new Student();
		kim.schoolName = "서울로봇고";
		System.out.println(kim.schoolName + "학생 객체 수 :" + kim.count);
		
		Student kang = new Student();
		System.out.println(kang.schoolName + "학생 객체 수 :" + kang.count);
		
		Student park = new Student();
		System.out.println(park.schoolName + "학생 객체 수 :" + park.count);
		
	}

}
