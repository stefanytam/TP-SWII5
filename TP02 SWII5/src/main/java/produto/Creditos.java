package produto;
	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	//Stefany Tam; Eduarda Vitória

	@WebServlet("/Creditos")
	public class Creditos extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Instituto Federal de Sao Paulo</h1>");
			out.println("<h2>SISTEMAS WEB I - TP02</h2>");
			out.println("<h1>Alunos:</h1>");
			out.println("<h2>Stefany Tam</h2>");
			out.println("<h2>Eduarda Vitória</h2>");
			out.println("<a href='Index.html'>Inicio</a>");
			out.close();
		}
	}
	
