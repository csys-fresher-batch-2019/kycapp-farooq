package kycservice;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnect {
	
	public static Connection getConnection()throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.205:1521:XE", "system", "oracle");
		return connection;
	}

}
