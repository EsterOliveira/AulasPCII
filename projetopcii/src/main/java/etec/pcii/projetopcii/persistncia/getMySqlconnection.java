package etec.pcii.projetopcii.persistncia;

import java.sql.DriverManager;

public class getMySqlconnection {
	
	public Connection getMysqlconnection() throws Exception{
		String stringconnection = "jdbc:mysql://localhost:3306/escola";
		Class.forName("com.mysql.jdbc.Driver");
		connection com = DriverManager.getConnection(stringConnection);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
