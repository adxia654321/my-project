package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DrinkOrder;

@WebServlet("/drinkOrder")
public class DrinkOrderServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 設定編碼
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		// 取得參數
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String iceMessge = req.getParameter("ice");
		
		// 判斷參數是否為空
		if(type == null || size == null || iceMessge == null) {
			resp.getWriter().print("參數輸入錯誤 ! ");
			return;
		}
		
		
		
		//根據參數 創建DrinkOrder物件 !
		DrinkOrder drinkOrder = new DrinkOrder(type, size, iceMessge);
		
		//建立分派器
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/drink_order.jsp");
		req.setAttribute("drinkOrder", drinkOrder);
		rd.forward(req, resp);
			
		//github測試 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
	}
	
}
