package testconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDb {

	public static void main(String[] args) {

		String driver = "com.mysql.cj.jdbc.Driver";

		String url = "jdbc:mysql://localhost:3306/abc";
		String userName = "root";
		String password = "root";

		try {

			Class.forName(driver);

			Connection con = DriverManager.getConnection(url, userName, password);

			System.out.println("connection succesful");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
