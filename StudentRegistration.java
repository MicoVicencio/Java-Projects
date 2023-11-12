package Student;

public class StudentRegistration {
	String firstname, lastname, course, section;
	int year, studentnum;
	
	StudentRegistration(int studentnum,String firstname, String lastname, String course, String section, int year){
		this.firstname = firstname;
		this.lastname = lastname;
		this.course = course;
		this.year = year;
		this.section = section;
		this.studentnum = studentnum;
	}
	
	   void list() {
		System.out.println("----------------------------------");
		System.out.println("Student Number "+ studentnum);
		System.out.println("Full Name: " + firstname + " " + lastname);
		System.out.println("Course: " + course);
		System.out.println("Section : " + section);
		System.out.println("Year: " + year);
		System.out.println("----------------------------------");
		}

}
