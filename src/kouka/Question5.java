package kouka;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(urlPatterns = {"/kouka/Question5"})
public class Question5 extends HttpServlet {
	public void doGet(
			HttpServletRequest request, HttpServletResponse response
	) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//Page.header(out);

		try {
			InitialContext ic = new InitialContext();
			DataSource ds = (DataSource) ic.lookup(
					"java:/comp/env/jdbc/kouka");
			Connection con = ds.getConnection();

			PreparedStatement st = con.prepareStatement(
					"SELECT * FROM USER");
			ResultSet rs = st.executeQuery();
			out.println("<h1>Userテーブル</h1>");
			out.println("<table border=1><th>UserId</th><th>UserName</th><th>MailAddress</th>");

			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>" + rs.getInt("UserId") + "</td>");
				out.println("<td>" + rs.getString("UserName") + "</td>");
				out.println("<td>" + rs.getString("MailAddress") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			st.close();

			PreparedStatement st2 = con.prepareStatement(
					"SELECT * FROM STUDENT");
			ResultSet rs2 = st2.executeQuery();
			out.println("<h1>Studentテーブル</h1>");
			out.println("<table border=1><th>StudentId</th><th>StudentName</th><th>Course</th>");
			while (rs2.next()) {
				out.println("<tr>");
				out.println("<td>" + rs2.getInt("StudentId") + "</td>");
				out.println("<td>" + rs2.getString("StudentName") + "</td>");
				out.println("<td>" + rs2.getString("Course") + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");

			st2.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace(out);

		}

		//Page.footer(out);
	}
}
