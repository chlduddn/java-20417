package s0508;

public class Student {
	private String name = "이름없음";
	private int grade;
	private float score;
	static int count = 0;
	static String schoolName = "로봇고";
	final static double PI = 3.141592;
	Student(){
		count++; //생성할때마다 학생수를 증가시키려는 목적
	}

	//이름을 저장
	void setName(String n) {
		name = n;
	}
	//이름은 리턴
	String getName(){
		return name;
	}
	
	void setGrade(int s) {
		grade = s;
	}
	int getGrade() {
		return grade;
	}
	
	void setScore(float c) {
		score = c;
	}
	float getScore() {
		return score;
	}
	void printAll() {
		System.out.println(getName() + getGrade() + ":" + getScore());
	}
}
