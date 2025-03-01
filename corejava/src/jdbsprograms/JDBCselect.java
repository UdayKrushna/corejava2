package jdbsprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//demo for jdbc
public class JDBCselect {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//step2 load and register the driver
	Class.forName("org.postgresql.Driver");
	System.out.println("load is over");
	//step3 establish connection
	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");
	//step4 create statement 
	Statement st=con.createStatement();
//step5 execute quary
	String strselect="select name,sbrach from student";
	System.out.println("the sql statement is"+strselect);
	//process the reuslt
	ResultSet rs=st.executeQuery(strselect);
	System.out.println("the records are");
	int rowcount=0;
	while(rs.next()) {
		String name=rs.getString("name");
		String sbrach=rs.getString("sbrach");
		System.out.println(name+""+sbrach);
	}
}
}
