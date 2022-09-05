package simpleproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



public class SignInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		
		PrintWriter output=response.getWriter();
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/signin","root","jen2117");
		String name=request.getParameter("usersName");
		String pwd=request.getParameter("userPwd");
		
		PreparedStatement ps=con.prepareStatement("select username from usersignin where username=? and password=?");
		ps.setString(1, name);
		ps.setString(2, pwd);
		
		ResultSet result=ps.executeQuery();
		
		if(result.next())
		{
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
					rd.forward(request, response);
		}
		else
		{
			output.println("<font color=red> Login Failed!!!!<br>");
			output.println("<a href=Signin.jsp> Let's Give Another Try!!!</a>");
		}
		
			
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}	
	}

}
