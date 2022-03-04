import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ecommerce.HibernateUtil;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitHibernate
 */
public class InitHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InitHibernate() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");

            SessionFactory factory = HibernateUtil.getSessionFactory();
                   
            Session session = factory.openSession();
            out.println("Hibernate Session opened.<br>");
            session.close();
            out.println("Hibernate Session closed.<br>");
                   
            out.println("</body></html>");
               
                
            } catch (Exception ex) {
                    throw ex;
            }

}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
