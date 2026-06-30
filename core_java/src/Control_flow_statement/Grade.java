package Control_flow_statement;

public class Grade {
	public static void main(String[] args) {
		int grade = 100;
		if (grade >= 40) {
			System.out.println("pass");
			if (grade >= 90) {
				System.out.println("grade A");
			} else if (grade >= 75) {
				System.out.println("grade B");
			} else{
				System.out.println("grade C");
			}
		} else {
			System.out.println("Fail");
		}
	}

}
