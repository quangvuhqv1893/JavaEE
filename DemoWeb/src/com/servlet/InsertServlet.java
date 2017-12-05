/**
 *
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployDao;
import com.entities.Employee;

/**
 * @description: .
 * @author User
 * @create: Dec 4, 2017
 */
@WebServlet("/insertData")
public class InsertServlet extends HttpServlet {

  /* (non-Javadoc)
   * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
    super.doPost(request, resp);
//    resp.setContentType("text/html");
    PrintWriter out = resp.getWriter();
    String id = request.getParameter("id");
    String firstName=request.getParameter("firstName");
    String lastName=request.getParameter("lastName");
    String phoneNumber=request.getParameter("area")+request.getParameter("pre")+request.getParameter("last");
    String gender=request.getParameter("gender");
    String description=request.getParameter("description");
    String vehicle=request.getParameter("vehicle");
    String way=request.getParameter("way");
    String img=request.getParameter("img");
    
    Employee employee = new Employee();
    EmployDao emDao = new EmployDao();
    boolean status =true;
    
    employee.setFirstName(firstName);
    employee.setLastName(lastName);
    employee.setPhoneNumber(phoneNumber);
    employee.setGender(gender);
    employee.setDescription(description);
    employee.setVehicle(vehicle);
    employee.setWay(way);
    employee.setImg(img);
    /*
     * if id!="null"&&id!="" then update data else insert data.
     */
    if((!"null".equals(id) && id != "")) {
      
      employee.setEmployeeID(Integer.parseInt(id));
      status=emDao.updateData(employee);
    }else {
      status = emDao.insertData(employee);
    }
    if (status==true) {
//      out.println("<p> successful!</p>");
      request.getRequestDispatcher("Form.html").include(request, resp);
    }else {
//      out.print("can't! please try again!");
    }
    resp.sendRedirect("showData");
    out.close();

  }
  

}
