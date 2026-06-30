package Control_flow_statement;

public class Salary {
	public static void main(String[] args) {
		int salary = 100000;
		if (salary > 70000) {
			System.out.println("Owner");
		if (salary < 120000) {
		}else if(salary >= 20000 ) {
			System.out.println("Manger");
		}else if(salary >= 30000) {
			System.out.println("Supervisor");
		}else if (salary >= 40000) {
			System.out.println("helper");
		}else {
			System.out.println("Worker");
		}
		}
	}

}
