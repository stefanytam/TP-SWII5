//Stefany Tam; Eduarda Vitória
package produto;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RemoveProduto")

public class RemoverProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request,
			HttpServletResponse response)
	        throws ServletException,IOException{
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		System.out.println(id);
		
		Produtos banco = new Produtos();
		banco.removerProduto(id);
		
		response.sendRedirect("ListaProdutos");
	}	
}
