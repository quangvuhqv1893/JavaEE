/**
 *
 */

package com.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @description: .
 * @author User
 * @create: Dec 5, 2017
 */
public class AppFilter implements Filter {

  /* (non-Javadoc)
   * @see javax.servlet.Filter#destroy()
   */
  @Override
  public void destroy() {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain fChain)
      throws IOException, ServletException {
    String userName, passWord;
    userName = request.getParameter("userName");
    passWord= request.getParameter("passWord");
    RequestDispatcher reDispatche;
    HttpSession session = ((HttpServletRequest) request).getSession();
    HashMap<String, String> loginSession = (HashMap<String, String>) session.getAttribute("account");
    if (userName==null || passWord == null) {
      if (loginSession==null) {
        reDispatche = request.getRequestDispatcher("ServletLogin.jsp");
        reDispatche.forward(request, response);
      }else {
        fChain.doFilter(request, response);
      }
    }else {
      fChain.doFilter(request, response);
    }
    
  }

  /* (non-Javadoc)
   * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
   */
  @Override
  public void init(FilterConfig arg0) throws ServletException {
    // TODO Auto-generated method stub
    
  }
  

}
