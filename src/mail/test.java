package mail;

import java.sql.*;

/**
 * A Java MySQL SELECT statement example.
 * Demonstrates the use of a SQL SELECT statement against a
 * MySQL database, called from a Java program.
 * 
 * Created by Alvin Alexander, http://alvinalexander.com
 */
public class test
{

  public static void main(String[] args)
  {
    try
    {
      // create our mysql database connection
      String myDriver =  ("com.mysql.jdbc.Driver");
      String myUrl = "jdbc:mysql://localhost/test";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM user_tb";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
        
        String username = rs.getString("user");
        String pass = rs.getString("pass");
        String repass = rs.getString("resetPass");
        String name = rs.getString("name");
        
        
        // print the results
        System.out.println(username+"," +pass+","+ repass+","+ name);
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
  }
}