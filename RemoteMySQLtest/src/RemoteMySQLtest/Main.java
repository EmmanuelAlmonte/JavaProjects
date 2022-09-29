/* RemoteMySQLtest.Java     last edited 3/29/2020 by C.Herbert
 * This code connects to a remote MYSQL database on the website CWHerbert.com
 * It connects via a fixed IP address (IPv4) to the database CWHDemo and
 * the table "pet", which is the same as the table used in the MySQL Documentation,
 * Chapter 3 tutorial.
 *
 * Read only access to the database and table is granted for the puposes of
 * learning to write java code to connect to and query a database
 * using SQL from within Java.
 *
 * host IP address: 68.178.217.12
 * database:        CWHDemo
 * username:        CWHDemo
 * password:        Cwhdemo%123  (Note: The password is case sensitive.)
 *
 * The query string in Line 69 in this file contains the SQL query "SELECT * FROM pet;" .
 *
 * Table metadata can be retrieved with the query "DESCRIBE pet;"
 * name    varchar(20)
 * species varchar(20)
 * sex     char(1)
 * birth   date
 * death   date
 *
 * Note that a suitable SQL driver must be used, and that the statement "import java.sql.*;" is required.
 * This demo is part of an IntelliJ project with the file "mysql-connector-java-8.0.19.jar" as a project library.
 * It is a cross-platform MySQL Connector/J JDBC driver.
 */

package RemoteMySQLtest;
import java.sql.*;

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
        selectAll(st);

        // Close the connection
        conn.close();
    } // end main()
    //*********************************************************************************


    /* The following method performs an SQL query
     * The parameter must be a Statement object with an established connection
     * to an SQL database.
     */
    public static void selectAll(Statement s) throws SQLException, ClassNotFoundException {

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

} // end class

