package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("최영우");
		e1.setNo(17);
		e1.setAge(18);
		System.out.println("[직원 정보] " + e1.toString());
		
		Employee e2 = new Employee();
		e2.setName("박시은");
		e2.setNo(18);
		e2.setAge(21);
		System.out.println("[직원 정보] " + e2.toString());
		

	}

}
