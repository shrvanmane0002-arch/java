
public class H {
	public static void main(String[] args) {
		float marks = 75f;
		if (marks >= 90 && marks <= 100) {
			System.out.println("Grade A");
		} else if (marks >= 75 && marks <= 89) {
			System.out.println("Grade b");
		} else if (marks >= 50 && marks <= 74) {
			System.out.println("Grade C");
		} else if (marks >= 35 && marks <= 49) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}

	}

}