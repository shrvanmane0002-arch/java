package Control_flow_statement;

public class Railway {
	public static void main(String[] args) {
		
		int age = 70;
		if(age > 5) {
			System.out.println("free ticket");
		}else if(age <= 12) {
			System.out.println("Half ticket 20 Rs");
		}else if (age <= 45) {
			System.out.println("full ticket 40 Rs ");
		}else {
			System.out.println("adult ticket 45 RS");
		}
	}

}
