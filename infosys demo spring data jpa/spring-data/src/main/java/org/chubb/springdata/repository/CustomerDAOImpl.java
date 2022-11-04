package org.chubb.springdata.repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.chubb.springdata.entity.Customer;

public class CustomerDAOImpl implements CustomerDAO {
  static Logger logger = Logger.getLogger(CustomerDAOImpl.class);
  private String appResources = "resources/application.properties";
  Connection con = null;
  PreparedStatement stmt = null;
  ResultSet rs = null;

  @Override
  public void insert(Customer customer) {
    // TODO Auto-generated method stub
    try (FileInputStream fis = new FileInputStream(appResources);) {
      Properties p = new Properties();
      p.load(fis);
      String dname = (String) p.get("JDBC_DRIVER");
      String url = (String) p.get("JDBC_URL");
      String username = (String) p.get("USER");
      String password = (String) p.get("PASSWORD");
      Class.forName(dname);
      // Register driver
      con = DriverManager.getConnection(url, username, password);
      // Create Connection
      String query = "insert into customer values (?,?,?,?,?,?)";
      // Create prepared Statement

      stmt = con.prepareStatement(query);
      stmt.setLong(1, customer.getPhoneNumber());
      stmt.setString(2, customer.getName());
      stmt.setInt(3, customer.getAge());
      stmt.setString(4, customer.getGender().toString());
      stmt.setInt(6, customer.getPlanId());
      stmt.executeUpdate();
      logger.info("Record inserted");
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    } finally {
      try {
        // close the prepared statement
        stmt.close();
        // close the connection
        con.close();
      } catch (Exception e) {
        logger.error(e.getMessage(), e);
      }
    }

  }

  @Override
  public int remove(long phoneNo) {
    // TODO Auto-generated method stub
    int result = 1;
    try (FileInputStream fis = new FileInputStream(appResources);) {
      Properties p = new Properties();
      p.load(fis);
      String dname = (String) p.get("JDBC_DRIVER");
      String url = (String) p.get("JDBC_URL");
      String username = (String) p.get("USER");
      String password = (String) p.get("PASSWORD");
      Class.forName(dname);
      // Create connection
      con = DriverManager.getConnection(url, username, password);
      String query = "DELETE FROM Customer WHERE phone_no = ?";
      // Create prepared statement
      stmt = con.prepareStatement(query);
      stmt.setLong(1, phoneNo);
      // Execute Query
      result = stmt.executeUpdate();

    } catch (Exception e) {
      logger.error(e.getMessage(), e);
    }  finally {
      try {
        // Close the preparedStatement
        stmt.close();
        // Close the connection
        con.close();
      } catch(Exception e) {
        logger.error(e.getMessage(), e);
      }
    }
    return result;

  }
}
