package Control_flow_statement;

public class BusTicket {
	public static void main(String[] args) {
		int age = 89;
		if(age >= 18 ) {
		if(age >=60) {
			System.out.println("Senior discount is -->10%");
		}else {
			System.out.println("Normal price");
		}
		}  
		else {
			System.out.println("child ticket");
		}
	}

}
