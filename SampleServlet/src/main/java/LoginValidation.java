

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginValidation
 */
public class LoginValidation extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
   
    public LoginValidation() 
    {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uname=request.getParameter("txtUname"); 
		String pword=request.getParameter("txtPword"); 
		
		if(uname.equalsIgnoreCase("java") && pword.equals("eclipse@123")) {
			
			RequestDispatcher rd=request.getRequestDispatcher("Welcome.html"); 
			rd.forward(request, response);
				
			
		}
		else 
		{     
			PrintWriter out=response.getWriter(); // out object prints output on web browser
			out.println("<h3> invalid username and assowerd</h3>");
			
			RequestDispatcher rd=request.getRequestDispatcher("index.html"); 
			rd.include(request, response);
			
		}
		
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
