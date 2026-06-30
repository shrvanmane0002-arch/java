package Control_flow_statement;

public class Electricitybill {
	public static void main(String[] args) {
		int  unit = 110;
		
		if (unit <= 100) {
			System.out.println("you will pay Rs 5 / unit");
		}else if (unit <= 200 ) {
			System.out.println("you will pay Rs 7 / unit");
		}else {
			System.out.println("you will pay Rs 10 / unit");
		}
	}

}
