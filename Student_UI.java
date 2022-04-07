import java.sql.SQLException;
import java.util.Scanner;

public class Student_UI {
	public static void main (String[] args) throws SQLException {
	
		System.out.print("Enter 1 to insert data, Enter 2 to check mark, Enter 0 to quit: ");
		Scanner sc = new Scanner(System.in);
		int opt= sc.nextInt();
			
			while(opt==1||opt==2) {
			Student stu= new Student();
			if (opt==1) {
				System.out.print("\nStudent ID: ");
				stu.setID(sc.nextInt());
				System.out.print("Student Name: ");
				stu.setName(sc.next());
				System.out.print("Department: ");
				stu.setDept(sc.next());
				System.out.print("Math Mark: ");
				stu.setMathMark(sc.nextInt());
				System.out.print("Science Mark: ");
				stu.setScMark(sc.nextInt());
				
				Student_Ctrl ctrl= new Student_Ctrl();
				ctrl.insertData(stu);
			}
			
			else if (opt==2) {
				System.out.print("\nEnter Student ID: ");
				int id=sc.nextInt();
				Student_Ctrl ctrl= new Student_Ctrl();
				ctrl.getStudent(id);
			}
			
			System.out.print("\nEnter 1 to insert data, Enter 2 to check mark, Enter 0 to quit: ");
			opt= sc.nextInt();
		}
			System.out.print("\nYou have quit the system!");
	}
	
	public void displayData(int id,String name,String dept,int math_mark,int sc_mark) {
		System.out.println("\nStudent ID: "+id+"\nStudent Name: "+name+"\nDepartment: "+dept+"\nMath Mark: "+math_mark+"\nScience Mark: "+sc_mark);
		
	}
}
