package com.example.jeep.s05.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Servlet implementation class Login
 */
@WebServlet("/s05/ex/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger(Login.class);
	private static LoginChecker checker = LoginChecker.getInstance();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		log.traceEntry();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
//		request.setAttribute("username", username);
		if(checker.checked(username, password)) {
			request.getRequestDispatcher("logged.jsp").forward(request, response);;
		} else {
			request.setAttribute("message", "qualcosa è andato storto");
			request.getRequestDispatcher("login.jsp").forward(request, response);;
		}
	}
}
