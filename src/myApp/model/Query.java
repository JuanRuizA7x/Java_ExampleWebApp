package myApp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author juan_ruiz
 *
 */
public class Query extends ConnectionDB {
	
	/**
	 * 
	 */
	public Query() {
		super();
	}

	public boolean authenticate(String user, String password) throws SQLException {
		
		String query = "SELECT * FROM users";
		Statement st = con.createStatement();
		ResultSet rs = null;
		rs = st.executeQuery(query);
		
		while(rs.next() ) {
			if(rs.getString("user").equals(user)) {
				if(rs.getString("password").equals(password)) {
					return true;
				} else {
					return false;
				}
			}
		}
		
		return false;
		
	}

}
