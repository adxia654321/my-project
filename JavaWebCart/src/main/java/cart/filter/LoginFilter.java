package cart.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/user/list", "/product/list"})

public class LoginFilter extends HttpFilter{

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		// 根據 session 屬性是否有userDTO 物件來判斷是否已經登入 ?
		HttpSession session = request.getSession();
		if(session.getAttribute("userDTO") == null) {
			// 如果沒登入 那就導入到登入畫面
			response.sendRedirect("/JavaWebCart/user/login");
			
		}else {
			// By pass
			chain.doFilter(request, response);
		}
			
	}
	

	
}
