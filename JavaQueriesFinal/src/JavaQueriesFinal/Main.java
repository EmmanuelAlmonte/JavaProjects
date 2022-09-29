/* JavaQueries.Java
* Created By: Emmanuel Almonte.
 * This code connects to a remote mysql database on the website CQHerbert.com
 * This program executes two query methods to the database
 * Last edited 08/26/2021, Course: CSCI 112, Professor C.Herbert
 */

package JavaQueriesFinal;
import java.sql.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args)
            throws Exception {

        System.out.println("Connecting to the database...\n");

        // Connect to a database by  establishing a Connection object
        Connection conn = DriverManager.getConnection("jdbc:mysql://160.153.75.195/CWHDemo", "CWHDemo", "Cwhdemo%123");

        System.out.println("Database connection established.\n");

        // Create a statement Object for this  database connection
        Statement st = conn.createStatement();

        // call a method that performs a query using Statement st
        selectAllCis(st);
        selectAllCSCI(st);

        // Close the connection
        conn.close();
    } // end main()
    //*********************************************************************************


    /* The following method performs an SQL query
     * The parameter must be a Statement object with an established connection
     * to an SQL database.
     */
    public static void selectAllCis(Statement s) throws SQLException, ClassNotFoundException {

        String qString;     // a String to hold an SQL query
        ResultSet results;           // the result set from an SQL query as a table
        Array QuerySet[] = new Array[100];

        // Returns all CIS courses.
        qString = "SELECT * FROM  fall2014 WHERE subject = \"CIS\";";

        // statement executing the query
        results = s.executeQuery(qString);

        // print headings for the output
        System.out.println(qString);
        System.out.printf("%-20s%-20s%-20s%n", "CRN", "Course Name", "Section");
        System.out.println("------------------------------------------------------");

        // Iterate through the result set and print CRN, Course name, and Section number
        while (results.next())
            System.out.printf("%-20s%-20s%-20s%n", results.getString(1), results.getString(2), results.getString(3));

        System.out.println("------------------------------------------------------");

    } // end selectAllCIS()
    public static void selectAllCSCI(Statement s) throws SQLException, ClassNotFoundException {

        String qString;     // a String to hold an SQL query
        ResultSet results;           // the result set from an SQL query as a table
        Array QuerySet[] = new Array[100];

        // Returns all CIS courses.
        qString = "SELECT * FROM  fall2014 WHERE subject = \"CSCI\";";

        // Send a statement executing the query and saving the result set
        results = s.executeQuery(qString);

        // print headings for the output
        System.out.println(qString);
        System.out.printf("%-20s%-20s%-20s%n", "CRN", "Course Name", "Section");
        System.out.println("------------------------------------------------------");

        // Iterate through the result set and print name, owner, and species attributes
        while (results.next())
            System.out.printf("%-20s%-20s%-20s%n", results.getString(1), results.getString(2), results.getString(3));

        System.out.println("------------------------------------------------------");

    } // end selectAllCSCI()

} // end main class

