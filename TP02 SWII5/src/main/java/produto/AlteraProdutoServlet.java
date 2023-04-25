package produto;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Stefany Tam; Eduarda Vitória
@WebServlet("/AlteraProduto")
public class AlteraProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Alterar produto");
				
		long id = Long.parseLong(request.getParameter("id"));
		System.out.println(id);
		String nomeProduto = request.getParameter("nome");		
		String paramDescricaoProduto = request.getParameter("descricao");		
		String paramUnidade = request.getParameter("unidadeCompra");
		int unidadeCompra = Integer.parseInt(paramUnidade);		
		String paramQtdPrevistaMes = request.getParameter("qtdPrevistoMes");
		double qtdPrevistoMes = Double.parseDouble(paramQtdPrevistaMes);		
		String paramPrecoMaxComprado = request.getParameter("precoMaxComprado");
		double precoMaxComprado =Double.parseDouble(paramPrecoMaxComprado);						
			
		Produtos banco = new Produtos();
		Produto produto = banco.buscarProdutoPeloId(id);
		produto.setNome(nomeProduto);
		produto.setDescricao(paramDescricaoProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		response.sendRedirect("ListaProdutos");

	}

}
