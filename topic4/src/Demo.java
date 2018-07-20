import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) {
		String history ="SELECT name, last_name, first_name FROM highschool.courses inner join teachers on courses.assigned_teacher = teachers.idteachers where name = \"History\";";
		String historystudents ="SELECT first_name,last_name FROM highschool.students inner join exams on students.reg_number = exams.student_id inner join courses on courses.id_courses = exams.courses_id  where courses.name = \"History\";";

		Connection myConn = MysqlConnection.getConnection();

			try {

				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(history);
				Statement mySecondStmt = myConn.createStatement();

				ResultSet myRsStudents = mySecondStmt.executeQuery(historystudents);

				System.out.print("Course:");
				while (myRs.next()) {
					System.out.println(myRs.getString(1));
					System.out.print("Teacher: "+myRs.getString(2)+" "+ myRs.getString(3));


				}
				System.out.println();
				System.out.println("First name"+" Last name");
				while(myRsStudents.next()){
					System.out.println( myRsStudents.getString(1)+"   |   "+ myRsStudents.getString(2));
				}
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
