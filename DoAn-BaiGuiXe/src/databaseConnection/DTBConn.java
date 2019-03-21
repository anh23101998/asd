package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class DTBConn 
{
	private static final String Time = null;
	private static final String Date = null;
	private static final String MaXe = null;
	public static Connection conn;
	public static Statement statement;
	
	public static Connection getDTBConn() {

		final String url = "jdbc:mysql://localhost:3306/baixe?useSSL=false";
		final String user = "root";
		final String password = "anh23101998";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static Object [] GetData(String Mx)  
	{
		Object [] fina = new Object[2];
		String sql = "Select * From `BAIXE`.`new_table` where Maxe = "+ Mx +";";
		try {
			  Connection connection = getDTBConn();			  
			  Statement statement = connection.createStatement(
		         ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			  ResultSet rs = statement.executeQuery(sql);
			  rs.first();
			  String time = rs.getString(4);
			  String date = rs.getString(5);
			  fina[0] = time;
			  fina[1] = date;
			  connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fina;
	}
	
	public static void InsertData(Object [] fina) 
	{
		String sql = " INSERT INTO `BAIXE`.`new_table` (MaXe, Image1, Image2, Time, Date)  VALUES ("+"'"+fina[0]+"'"+", "+"'"+fina[1]+"'"+", "+"'"+fina[2]+"'"+", "+"'"+fina[3]+"'"+", "+"'"+fina[4]+"'"+" );";
		//String sql ="INSERT INTO `BAIXE`.`new_table`  (MaXe, Image1, Image2, Time, Date ) VALUES ( '12236', 'anh1','anh2','20:10:50','2017-06-15' );";
		try {
				Connection connection = getDTBConn();			 
				Statement statement = connection.createStatement();
			int rowCount = statement.executeUpdate(sql);
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
