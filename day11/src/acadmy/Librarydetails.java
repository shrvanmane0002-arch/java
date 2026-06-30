package acadmy;

public class Librarydetails {
	
	public static void main(String[] args) {
		
		Library s = new Library();
		s.libraryName = "smLibrary";
		s.libraryContactNo = 123456734l;
		s.libraryregisterNo = 4004332l;
		s.studentAttendance = 32;
		s.totalStudent = 40;
		s.libraryfees = 15.999;
		s.city = "pune";
		s.address ="pimpri Chinchwad pune 19";
		s.batchStart = "1 AM";
		s.batchEnd = " 3 AM ";
		s.addmissionStart = "12 April 2026";
		s.showDetails();
	}

}
