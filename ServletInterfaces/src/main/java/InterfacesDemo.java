

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class InterfacesDemo
 */

    
public class InterfacesDemo implements Servlet {
        
        ServletConfig config=null;
          public void init(ServletConfig config){
              this.config=config;
              System.out.println("Initialization complete");
           }

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		
        System.out.println("In destroy() method");
	}
	
    public ServletConfig getServletConfig(ServletConfig config){
        return config;
    }


	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig1() {
		// TODO Auto-generated method stub
	 return null; 
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
        return "This is a sample servlet info";
	}

	/**
	 * @param res 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");
    }

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}



