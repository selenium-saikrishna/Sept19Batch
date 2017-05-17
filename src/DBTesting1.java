import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.firefox.FirefoxDriver;


public class DBTesting1 {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Connection conn=null;
		String url="jdbc:mysql://localhost:3306/";
		String dbname="sys";
		String DBdriver="com.mysql.jdbc.Driver";
		String userName="root";
		String password="krishna";
		String abc="org.openqa.selenium.firefox.FirefoxDriver";
		
		Class.forName(DBdriver).newInstance();
		conn=DriverManager.getConnection(url+dbname,userName,password);
		
		PreparedStatement psmt=conn.prepareStatement("select * from emp where sal>? and deptno=?");
		psmt.setString(1,"2000");
		psmt.setString(2,"10");
		ResultSet rs=psmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("ename")+"---"+rs.getString("sal"));
		}
		conn.close();
	}

}
