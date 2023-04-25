package produto;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NovoProduto")
//Stefany Tam; Eduarda Vitória
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost (HttpServletRequest request,
			HttpServletResponse response)
	        throws ServletException,IOException{
		System.out.println("Cadastrando novo produto");
		
		String nomeProduto = request.getParameter("nome");
		String paramDescricaoProduto = request.getParameter("descricao");		
		String paramUnidade = request.getParameter("unidadeCompra");
		String paramQtdPrevistaMes = request.getParameter("qtdPrevistoMes");
		String paramPrecoMaxComprado = request.getParameter("precoMaxComprado");
			
		int unidadeCompra = Integer.parseInt(paramUnidade);
		double qtdPrevistoMes = Double.parseDouble(paramQtdPrevistaMes);
	    double precoMaxComprado =Double.parseDouble(paramPrecoMaxComprado);
		
		Produto produto = new Produto();
		produto.setNome(nomeProduto);
		produto.setDescricao(paramDescricaoProduto);
		produto.setUnidadeCompra(unidadeCompra);
		produto.setQtdPrevistoMes(qtdPrevistoMes);
		produto.setPrecoMaxComprado(precoMaxComprado);
		
		Produtos banco = new Produtos();
		banco.adicionar(produto);
		
		request.setAttribute("produto", produto.getNome());
		
		response.sendRedirect("ListaProdutos");
	}	
}
