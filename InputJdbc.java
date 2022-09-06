import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InputJdbc{

	public static void main(String[] args) throws Exception
	{
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/harendraDb", "root", "root@123");
		
		Statement st=con.createStatement();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the table name");
		
		String tname =br.readLine();
		
		
		String query="create table " + tname + "(ENO int(3) primary key,ENAME varchar(20),ESAL float(6))";
		st.executeUpdate(query);
		System.out.println(tname+" table Successfully created");
		st.close();
		con.close();
		// TODO Auto-generated method stub

	}

}
