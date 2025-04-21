package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Coffee;

@WebServlet("/coffee")
public class CoffeeServlt extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.請求編碼
		req.setCharacterEncoding("UTF-8");
		
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/coffee_form.jsp");
		rd.forward(req, resp);
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1.請求編碼
				req.setCharacterEncoding("UTF-8");
				
		// 接收參數
		String milkCC = req.getParameter("milkCC");
		String coffeeCC = req.getParameter("coffeeCC");
		
		Coffee coffee = new Coffee(milkCC, coffeeCC);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/coffee_result.jsp");
		req.setAttribute("coffee", coffee);
		rd.forward(req, resp);
		
	}

	

}
