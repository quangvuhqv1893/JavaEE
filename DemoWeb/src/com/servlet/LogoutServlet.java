/**
 *
 */

package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @description: .
 * @author User
 * @create: Dec 5, 2017
 */
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet {

  /* (non-Javadoc)
   * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
    session.removeAttribute("account");
    
    RequestDispatcher requestDispatcher = req.getRequestDispatcher("Login.jsp");
    requestDispatcher.forward(req, resp);

  }
 
}
