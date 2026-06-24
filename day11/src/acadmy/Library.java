package acadmy;

public class Library { 
	String libraryName;
	long libraryContactNo;
	long libraryregisterNo;
	int studentAttendance;
	int totalStudent;
	double libraryfees;
	String city ;
    String address;
    String batchStart;
    String batchEnd;
    String addmissionStart;
    
    public void showDetails() {
    	
    System.out.println("library Name is -->" + libraryName);
    System.out.println("library Contact No is -->" + libraryContactNo);
    System.out.println("library Register No is -->" + libraryregisterNo);
    System.out.println("student Attendance is -->" + studentAttendance);
    System.out.println("total library Student is -->" + totalStudent);
    System.out.println("library fees  -->" + libraryfees);
    System.out.println("library city is -->" + city);
    System.out.println("library address is -->" + address);
    System.out.println("library batch StartingTime  -->" + batchStart);
    System.out.println("library batch EndingTime  -->" + batchEnd);
    System.out.println("library addmission Start -->" + addmissionStart);

}
}