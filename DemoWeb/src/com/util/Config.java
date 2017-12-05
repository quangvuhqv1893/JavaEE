/**
* @description: class.
*/

package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author User
 *
 */
public class Config {
  static String Driver        = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
  static String ConnectionURL = "jdbc:sqlserver://localhost:1433" + ";instance=SQLEXPRESS;databaseName=User;";
  static String userName      = "sa";
  static String passWord      = "1";
  static String URL           = "jdbc:sqlserver://localhost:1433"
      + ";instance=SQLEXPRESS;databaseName=User;integratedSecurity=true;";

  /**
   * @throws SQLException
   * @throws ClassNotFoundException
   * @description: Method return connection database.
   */
  public static Connection connect() throws SQLException, ClassNotFoundException {
    Class.forName(Driver);
    // get connection
    Connection cn = DriverManager.getConnection(ConnectionURL,userName,passWord);
    return cn;
  }

}
