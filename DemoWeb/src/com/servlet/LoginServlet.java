/**
 *
 */

package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.entities.User;
import com.util.Config;

/**
 * @description: .
 * @author User
 * @create: Dec 5, 2017
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
  
  private static final long serialVersionUID = 1L;
  private LoginDao loginDao = new LoginDao();

  /* (non-Javadoc)
   * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String userName, passWord;
    try {
      Connection connection = Config.connect();
      userName = req.getParameter("userName");
      passWord = req.getParameter("passWord");
      User user = new User(userName, passWord);
      Boolean result = loginDao.loginUser(user);
      RequestDispatcher rDispatcher;
      HttpSession session;
      HashMap<String, String> userSession;
      if (result) {
        session = req.getSession();
        userSession = new HashMap<String, String>();
        userSession.put("userName", userName);
        userSession.put("passWord", passWord);
        session.setAttribute("account", userSession);
        rDispatcher =req.getRequestDispatcher("Index.jsp");
        rDispatcher.forward(req, resp);
      }else {
        rDispatcher =req.getRequestDispatcher("Login.jsp");
        rDispatcher.forward(req, resp);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  

}
