/**
 *
 */

package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entities.Employee;
import com.util.Config;
import com.util.SqlQuery;

/**
 * @description: .
 * @author User
 * @create: Dec 4, 2017
 */
public class EmployDao {

  /**
   * @description: insert into database.
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @param employee
   * @return
   */
  public boolean insertData(Employee employee) {
    try {
      Connection connection = Config.connect();
      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.INSERT_DB);
      pStatement.setString(1, employee.getFirstName());
      pStatement.setString(2, employee.getLastName());
      pStatement.setString(3, employee.getPhoneNumber());
      pStatement.setString(4, employee.getGender());
      pStatement.setString(5, employee.getDescription());
      pStatement.setString(6, employee.getVehicle());
      pStatement.setString(7, employee.getWay());
      pStatement.setString(8, employee.getImg());
      pStatement.executeUpdate();
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }

  /**
   * @description: update database.
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @param employee
   * @return
   */
  public boolean updateData(Employee employee) {
    try {
      Connection connection = Config.connect();
      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.UPDATE_DB);
      pStatement.setString(1,employee.getFirstName() );
      pStatement.setString(2, employee.getLastName());
      pStatement.setString(3, employee.getPhoneNumber());
      pStatement.setString(4, employee.getGender());
      pStatement.setString(5, employee.getDescription());
      pStatement.setString(6, employee.getVehicle());
      pStatement.setString(7, employee.getWay());
      pStatement.setString(8, employee.getImg());
      pStatement.setString(9, employee.getEmployeeID());
      pStatement.executeUpdate();
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
  }
  
  /**
   * @description: delete employee.
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @param employeeID
   * @return
   */
  public boolean deleteEmployee(int employeeID) {
    try {
      Connection connection = Config.connect();
      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.DELETE_DB);
      pStatement.setInt(1, employeeID);
      pStatement.executeUpdate();
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
    return true;
    
  }
  
  /**
   * @description: get employee by id.
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @param employeeID is id of employee.
   * @return employee.
   */
  public Employee getEmployeeById(int employeeID) {
    Employee employee = new Employee();
    try {
      Connection connection = Config.connect();
      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.GET_EMPLOYEE_BY_ID);
      pStatement.setInt(1, employeeID);
      ResultSet resultSet = pStatement.executeQuery();
      if (resultSet.next()) {
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));
        employee.setPhoneNumber(resultSet.getString(4));
        employee.setGender(resultSet.getString(5));
        employee.setDescription(resultSet.getString(6));
        employee.setVehicle(resultSet.getString(7));
        employee.setWay(resultSet.getString(8));
        employee.setImg(resultSet.getString(9));
      }
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return employee;
    
  }
  
  /**
   * @description: get all emloyee of database.
   * @author User
   * @create: Dec 4, 2017
   * @modifier:
   * @modified date:
   * @return
   */
  public List<Employee> getAllEmployee(){
    List<Employee> listEmp =new ArrayList<Employee>();
    try {
      Connection connection = Config.connect();
      Statement statement = connection.createStatement();
//      PreparedStatement pStatement = connection.prepareStatement(SqlQuery.GET_ALL_EMPLOYEE);
      ResultSet resultSet = statement.executeQuery(SqlQuery.GET_ALL_EMPLOYEE);
      while(resultSet.next()) {
        Employee employee = new Employee();
        employee.setEmployeeID(resultSet.getString(1));
        employee.setFirstName(resultSet.getString(2));
        employee.setLastName(resultSet.getString(3));
        employee.setPhoneNumber(resultSet.getString(4));
        employee.setGender(resultSet.getString(5));
        employee.setDescription(resultSet.getString(6));
        employee.setVehicle(resultSet.getString(7));
        employee.setWay(resultSet.getString(8));
        employee.setImg(resultSet.getString(9));
        listEmp.add(employee);
      }
      connection.close();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
    return listEmp;
    
  }
}
