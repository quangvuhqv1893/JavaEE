/**
 *
 */

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.entities.User;
import com.util.Config;
import com.util.SqlQuery;

/**
 * @description: .
 * @author User
 * @create: Dec 5, 2017
 */
public class LoginDao {
  public boolean loginUser(User user) {
    try {
      Connection connection = Config.connect();
      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.CHECK_LOGIN);
       pStatement.setString(1, user.getUserName());
      pStatement.setString(2, user.getPassWord());
      ResultSet resultSet = pStatement.executeQuery();
//      connection.close();
      if (resultSet.next()) {
        return true;
      }
      else {
        return false;
      }
    } catch (Exception e) {
      return false;
    }
  }
}
