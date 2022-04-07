import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Ctrl {
	public void insertData(Student stu) throws SQLException {
		// Connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1" ,"root","L1i2_C2i2");	
		Statement s = conn.createStatement();        
		
		s.executeUpdate("insert into student values('"+ stu.getID()+"','"+stu.getName()+"','"+stu.getDept()+"','"+stu.getMathMark()+"','"+stu.getScMark()+"')"); 
		System.out.print("\nData inserted successfully!\n");
				
	}
	
	public void getStudent(int id) throws SQLException {
		Student stu= new Student();
		// Connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1" ,"root","L1i2_C2i2");	
		Statement stmt = conn.createStatement(); 
		
	
				ResultSet rs = stmt.executeQuery ("select * from student where id= '"+id+"'"); 
				
				if(rs.next()) {
					stu.setID(rs.getInt("id"));
					stu.setName(rs.getString("name"));
					stu.setDept(rs.getString("department"));
					stu.setMathMark(rs.getInt("mathMark"));
					stu.setScMark(rs.getInt("scienceMark"));
				}
		
		Student_UI view= new Student_UI();
		view.displayData(stu.getID(), stu.getName(), stu.getDept(), stu.getMathMark(), stu.getScMark());
		}
	}

