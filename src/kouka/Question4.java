package kouka;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/kouka/Question4"})
public class Question4 extends HttpServlet {

	//Getリクエストでアクセスされた時の処理
	public void doGet (HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//フォームで送られてきた名前をコンソールに表示する
		System.out.println("お名前："+request.getParameter("name"));
		//フォワードする
		request.getRequestDispatcher("Question4output.jsp")
			.forward(request, response);

	}
}
