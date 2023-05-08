package s0508;

public class Student {
	String name;
	int grade;
	static int count = 0;
	static String schoolName = "로봇고";
	Student(){
		count++; //생성할때마다 학생수를 증가시키려는 목적
	}
}
