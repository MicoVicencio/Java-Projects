package Student;
import java.util.Scanner;
public class Main {
           public static void main(String[] args) {  
    	   
    	   Scanner scan = new Scanner(System.in);
    	   StudentRegistration students[] = new StudentRegistration[10];
    	   String firstname[] = new String[10];
    	   String lastname[] = new String[10];
    	   String course[] = new String[10];
    	   String section[] = new String[10];
    	   int year[] = new int[10];
    	   int studentnum[] = new int[10];
    	   int studentcount = 1;
    	   

    	   for(int i = 0; i < students.length; i++){
      	   System.out.println("Register Student. Fill up the details!");
      	   studentnum[i] = studentcount;
      	   studentcount++;
      	   System.out.print("Enter Firstname: ");
      	   firstname[i] = scan.nextLine();
      	   System.out.print("Enter Lastname: ");
      	   lastname[i] = scan.nextLine();
      	   System.out.print("Enter Course: ");
      	   course[i] = scan.nextLine();
      	   System.out.print("Enter Section: ");
      	   section[i] = scan.nextLine();
      	   System.out.print("Enter Year: ");
      	   year[i] = scan.nextInt();
      	   scan.nextLine();
      	   System.out.println("----------------------------------");
      	   }  
    	   
    	   for(int a = 0; a < students.length; a++) {
    		   students[a] = new StudentRegistration(studentnum[a] ,firstname[a], lastname[a], course[a], section[a], year[a]);
    	   }
    	 
    	   System.out.println("Student LIst:");
    	   for(int x = 0; x < students.length; x++) {
    	   students[x].list();
    	}
    
       }
       
      
       
       
       
       
       
       
}
