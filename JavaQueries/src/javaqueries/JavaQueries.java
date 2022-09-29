/* JavaQueries.Java
* This code connects to a remote mysql database on the website CQHerbert.com
* This program executes two query methods to the database 
* Last edited 08/26/2021, Course: CSCI 112, Professor C.Herbert
*/

package javaqueries;

import java.sql.*;

public class JavaQueries {
    public static void main(String[] args) throws Exception{

        // Print connecting to the database.
         System.out.println("Connecting to the database...\n");

        
        // Connect to a database by  establishing a Connection object
        Connection conn = DriverManager.getConnection("jdbc:mysql://160.153.75.195/CWHDemo", "CWHDemo", "Cwhdemo%123");

        System.out.println("Database connection established.\n");

        // Create a statement Object for this  database connection
        Statement queryStatementOne = conn.createStatement();

        // call a method that performs a query using Statement 
        selectQueries(queryStatementOne);

        // Close the connection
        conn.close();
        
    }// end main()

    public static void selectQueries(Statement s) throws SQLException, ClassNotFoundException {

        String queryString;     // a String to hold an SQL query 
        ResultSet rs;           // the result set from an SQL query as a table

        
        // This sample query returns all of the data in the pet table.
        //modify this query string to perform a different query.
        queryString = "SELECT * FROM pet;";

        // Send a statement executing the query and saving the result set 
        rs = s.executeQuery(queryString);

        // print headings for the output
        System.out.println(queryString);
        System.out.printf("%-20s%-20s%-20s%n", "Pet's Name", "Owner", "Species");
        System.out.println("*******************************************************");

        // Iterate through the result set and print name, owner, and species attributes
        while (rs.next())
            System.out.printf("%-20s%-20s%-20s%n", rs.getString(1), rs.getString(2), rs.getString(3));
        
        System.out.println("*******************************************************");

    } // end selectAll()
}
