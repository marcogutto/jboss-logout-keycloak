package com.example;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout.
 */
public class Logout extends HttpServlet {
    /**
     * Serialização.
     */
    private static final long serialVersionUID = 1L;
    
    private static final String PAGE_LOGIN = "login.jsf";

    /**
     * Realiza o logout.
     *
     * @param request request.
     * @param response response.
     * @throws IOException Exception.
     * @throws ServletException ServletException.
     *
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        HttpSession session = request.getSession(false);
        
        request.logout();
        
//        if (session != null) {
//        	session.invalidate();
//        }
    	
//    	public void handleLogout(HttpServletRequest req) throws ServletException {
//            if (isLogoutAction(request)) {
//            	request.logout();
//            }
//        }

        response.sendRedirect(PAGE_LOGIN);
    }
    
//    public boolean isLogoutAction(HttpServletRequest req) {
//        return getAction(req).equals("logout");
//    }
//    
//    private String getAction(HttpServletRequest req) {
//        if (req.getParameter("action") == null) return "";
//        return req.getParameter("action");
//    }

}
