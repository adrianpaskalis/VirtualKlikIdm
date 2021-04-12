package PageFactory;

import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

public class ConnectiontoDB {
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
        String dbUrl = "jdbc:mysql://172.31.2.36/master";					

		//Database Username		
		String username = "sa";	
        
		//Database Password		
		String password = "Int3l@1dm";				

		//Query to Execute		
		String query = " use klikindomaret_customer_preproduction \r\n"
				+ "  select * from Customers where Mobile ='0895634338579'";	
        
 	    //Load mysql jdbc driver		
   	    Class.forName("com.mysql.jdbc.Driver");			
   
   		//Create Connection to DB		
    	Connection con = DriverManager.getConnection(dbUrl,username,password);
  
  		//Create Statement Object		
	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
 		ResultSet rs= stmt.executeQuery(query);							
 
 		// While Loop to iterate through all data and print results		
		while (rs.next()){
	        		String myName = rs.getString(1);								        
                    String myAge = rs.getString(2);					                               
                    System. out.println(myName+"  "+myAge);		
            }		
			 // closing DB Connection		
			con.close();			
}
}

