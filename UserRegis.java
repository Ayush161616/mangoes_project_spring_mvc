package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.MyDb;

/**
 * Servlet implementation class UserRegis
 */
public class UserRegis extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter writer = response.getWriter();
		String firstname = request.getParameter("fname");
		String lastname = request.getParameter("lname");
		String address = request.getParameter("aname");
		String email = request.getParameter("ename");
		writer.println("Name is "+firstname);
		writer.println("Lastname is "+lastname);
		String sl = "insert into customer(fname,lname,aname,ename)values('"+firstname+"','"+lastname+"','"+address+"','"+email+"')";
	    MyDb db = new MyDb();
	    Connection con = db.getCon();
	    try {
	    	Statement st = con.createStatement();
	    	st.executeUpdate(sl);
	    	response.sendRedirect("/mangoproject/jsp/regissuccess.jsp");
	    	
	    	
	    	
	    }
	    catch( SQLException e) {
	    	e.printStackTrace();
	    	
	    	
	    	 
	    }
	    //writer.println("Name of the user"+firstname);
	    //System.out.println("name of the user is "+firstname);
	}


}
