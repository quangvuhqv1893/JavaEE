/**
 *
 */

package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/showData")
public class Showdata extends HttpServlet {

  private static final long serialVersionUID = 1L;

  /*
   * (non-Javadoc)
   * 
   * @see
   * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
   * javax.servlet.http.HttpServletResponse)
   */
//  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//    super.doGet(req, resp);
//    resp.setContentType("text/html");
//    PrintWriter out = resp.getWriter();
    EmployDao employDao = new EmployDao();
//    List<Employee> list = employDao.getAllEmployee();
    req.setAttribute("showData", employDao.getAllEmployee());
    RequestDispatcher despatch = req.getRequestDispatcher("ServletShowData.jsp");
    despatch.forward(req, resp);
  }
}
