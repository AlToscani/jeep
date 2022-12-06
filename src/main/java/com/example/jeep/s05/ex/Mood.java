package com.example.jeep.s05.ex;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mood
 */
@WebServlet("/s05/mood")
public class Mood extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static MoodChecker checker = MoodChecker.getInstance();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String mood = checker.checked(request.getParameter("mood"));
		String name = request.getParameter("name");
		if(name.isBlank()) {
			name = "Anonimo";
		}
		request.setAttribute("name", name);
		request.setAttribute("mood", mood);
		request.getRequestDispatcher("/s05/ex/mood.jsp").forward(request, response);
	}

}
