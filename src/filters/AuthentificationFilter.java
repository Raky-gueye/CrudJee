package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthentificationFilter
 */
@WebFilter({"/","/list","/add","/delete","/update","/logout"})
public class AuthentificationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthentificationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp ,FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req ;

		HttpSession session = request.getSession();
		HttpServletResponse response = (HttpServletResponse) resp ;
		if(session.getAttribute("isConnected") != null) {
			chain.doFilter(request, response);
		}
		else {
			response.sendRedirect("login");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
