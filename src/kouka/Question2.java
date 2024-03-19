package kouka;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/Question2"})
public class Question2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Date date = new Date();
		int year = date.getYear()+1900;
		int month = date.getMonth()+1;
		int dispDate = date.getDate();
		int dayOfWeek = date.getDay();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		String greeting = null;
		String DayOfWeekStr = null;

		if(hour >= 5 && hour <= 10){
			greeting = "Good morning!";
		}else if(hour <= 16){
			greeting = "Hello!";
		}else{
			greeting = "Good evening!";
		}

		switch(dayOfWeek){
		case 0:
			DayOfWeekStr = "日";
			break;

		case 1:
			DayOfWeekStr = "月";
			break;


		case 2:
			DayOfWeekStr = "火";
			break;


		case 3:
			DayOfWeekStr = "水";
			break;


		case 4:
			DayOfWeekStr = "木";
			break;


		case 5:
			DayOfWeekStr = "金";
			break;


		case 6:
			DayOfWeekStr = "土";
			break;
		}


		System.out.println(year);
		response.setContentType("text/plain; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.printf("%d年%d月%d日(%s) %d:%d:%d",year,month,dispDate,DayOfWeekStr,hour,min,sec);
		out.println(greeting);
	}

}
