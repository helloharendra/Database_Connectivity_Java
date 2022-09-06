package javaDatabaseConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DemoJdbc {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harendraDb", "root", "root@123");
		
		Statement st=con.createStatement();
		
		String query="create table employee1(ENO int(3) primary key,ENAME varchar(20),ESAL float(6))";
		
		st.executeUpdate(query);
		System.out.println("table Successfull created");
		st.close();
		con.close();
		
	}

}
