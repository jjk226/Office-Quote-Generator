package com.james.office.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletTest
 */
@WebServlet("/ServletTest")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = "springstudent";
		String password = "springstudent";
		
		String jdbcURL = "jdbc:mysql://localhost:3306/office_quote_generator?useSSL=false&serverTimezone=UTC";
		String jdbcDriver = "com.mysql.jdbc.Driver";
		
		
		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to database: " + jdbcURL);
			
			System.out.println("Connecting to Database: " + jdbcURL);
			
			Class.forName(jdbcDriver);
			
			Connection myConn = DriverManager.getConnection(jdbcURL, user, password);
			
			System.out.println("Connection succesful.");
			myConn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
