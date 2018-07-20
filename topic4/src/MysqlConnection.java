import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection {
	static Connection conn;
	public static Connection getConnection() {


		try {

			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/highschool?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "globant123");

		} catch (Exception e) {

			e.printStackTrace();

		}
		return conn;
	}

}






