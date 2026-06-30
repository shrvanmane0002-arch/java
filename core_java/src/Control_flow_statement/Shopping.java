package Control_flow_statement;

public class Shopping {
  public static void main(String[] args) {
	int amount = 1500;
	char m= 'n';
	if(amount >= 1000) {
		if (m=='y' ) {
			System.out.println("you will get 20% discount ");
		}
		else {
			System.out.println("you will get 10% discount ");
		}
	}else {
		System.out.println("No discount");
	}
}
}
