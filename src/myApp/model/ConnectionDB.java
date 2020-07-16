package myApp.model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author juan_ruiz
 *
 */
public class ConnectionDB {
	
	private final String URL = "jdbc:mysql://localhost:3306/test";
	private final String USERNAME = "root";
	private final String PASSWORD = "juan1005094822";
	protected Connection con;

	public ConnectionDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
