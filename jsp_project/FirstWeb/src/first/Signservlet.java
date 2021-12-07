package first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Signservlet")
public class Signservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		
		// 응답하는 데이터 타입
		response.setContentType("text/html); charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>Sign Up Data</title></head>");
		out.println("	<body>");
		out.println("		<h1>");
		out.println("			id : " + id + " <br>");
		out.println("			pw : " + pw + " <br>");
		out.println("			Name : " + name + " <br>");
		out.println("		</h1>");
		out.println("	</body>");
		out.println("</html>");
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Post 방식으로 요청 처리");
		doGet(request, response);
	}

}