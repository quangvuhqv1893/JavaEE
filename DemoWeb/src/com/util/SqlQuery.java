/**
 *
 */

package com.util;

/**
 * @description: .
 * @author User
 * @create: Dec 4, 2017
 */
public class SqlQuery {
  public static final String INSERT_DB = "INSERT dbo.Employee VALUES(?,?,?,?,?,?,?,?)";
  public static final String UPDATE_DB = "UPDATE dbo.Employee SET firstName=?, lastName=?, phoneNumber=?, gender=?,description=?,vehicle=?,way=?,img=? WHERE employeeID=?";
  public static final String DELETE_DB = "DELETE FROM dbo.Employee WHERE employeeID=?";
  public static final String GET_EMPLOYEE_BY_ID = "SELECT * FROM  dbo.Employee WHERE EmployeeID=?";
  public static final String GET_ALL_EMPLOYEE = "SELECT * FROM  dbo.Employee ORDER BY EmployeeID ASC";
}
        