package Control_flow_statement;

public class Withdrawal { 
	public static void main(String[] args) {
		int balance =5000 ;
		int withdrawal = 10000;
		
		if (withdrawal <= balance) {
			if ( withdrawal % 100 == 0) {
				System.out.println("Amount withdrawal");
			}else {
				System.out.println("Enter valide amount");
			}
		}else {
			System.out.println("insufficient balance");
		}
	}

}
