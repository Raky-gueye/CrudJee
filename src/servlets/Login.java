package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet({"/login","/logout"})
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String VUE_LOGIN ="/WEB-INF/login.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      switch(request.getServletPath()) {
      case "/login" : 
			 getServletContext().getRequestDispatcher(VUE_LOGIN).forward(request, response);
break;
      case "/logout" : 
			 HttpSession session = request.getSession();
    	     session.invalidate();
			 response.sendRedirect("login");
    	     break;
      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String  login = request.getParameter("login");
		 String  password = request.getParameter("password");
		 if(login.equals("raky")&& password.equals("kyra")) { 
			 HttpSession session = request.getSession();
			 session .setAttribute("isConnected", true);
			 response.sendRedirect("list");
		 }
			    
		 else {
			    request.setAttribute("isConnected",true);
			    request.setAttribute("login",login);

				getServletContext().getRequestDispatcher(VUE_LOGIN).forward(request, response);
		 
	}
	}

}

