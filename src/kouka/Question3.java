package kouka;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/kouka/forward"})
public class Question3 extends HttpServlet {

	//Getリクエストでアクセスされた時の処理
	public void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォワードする
		request.getRequestDispatcher("forward.jsp")
			.forward(request, response);

	}
}
