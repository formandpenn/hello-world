package satvikIsGood;


import java.sql.*;
import java.util.Properties;

public class MySqlConnector {

    
    private static final String USERNAME1 = "root";
    private static final String PASSWORD1 = "rforman92";
    private static final String CONN_STRING1 = "jdbc:mysql://localhost/Movies?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private static final String USERNAME2 = "awsmysql";
    private static final String PASSWORD2 = "Z1j1G3Uo";
    private static final String CONN_STRING2 ="jdbc:mysql://mysqltest.ctpoxoel2pz9.us-east-1.rds.amazonaws.com/movies";

	
	
	
	
	
	public static void main(String[] args) {
        Connection conn = null;
        try {
            //conn = DriverManager.getConnection(CONN_STRING1,USERNAME1,PASSWORD1);
            conn = DriverManager.getConnection(CONN_STRING2,USERNAME2,PASSWORD2);
            
            
            System.out.println("Connected for once and for all");
            
            Statement stmt = conn.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from movie");  
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)
                 + "  " + rs.getString(4) + "  " ); 
            }
            conn.close(); 
            System.out.println("Closed");
            
        } catch (Exception e){
            System.err.println(e);
        }
    }

}

	