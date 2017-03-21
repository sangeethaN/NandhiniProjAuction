package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StockController
 */
@WebServlet("/StockController")
public class StockController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StockController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=0;
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
		String name=request.getParameter("username");
		char str[]=name.toCharArray();
		
		for(int i=0;i<str.length;i++)
		{
			if (Character.isLetter(str[i])) 
			 count++;
		}
		if(count!=str.length)
			 
				{
			out.print("<script> type=\"text/javascript\">");
				out.print("alert('special charecter not allowed in username');");
				out.print("location='SubmitStocks.jsp';");
				out.print("</script>");}
			
		String[] company=request.getParameterValues("company");
		UserStockDao usd=new UserStockDao();
		
			usd.add(name,company);
		
		
		
		
		
		
		
	}

}
