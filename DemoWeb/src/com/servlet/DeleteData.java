/**
 *
 */

package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmployDao;

/**
 * @description: .
 * @author User
 * @create: Dec 4, 2017
 */
@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {

  /* (non-Javadoc)
   * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    super.doGet(req, resp);
    String sid =  req.getParameter("EmployeeID");
    int id = Integer.parseInt(sid);
    EmployDao employDao = new EmployDao();
    employDao.deleteEmployee(id);
    resp.sendRedirect("showData");
  }

}
