package produto;
//Stefany Tam; Eduarda Vitória
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Produtos {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;

static {
		
		Produto produto1=new Produto();
		produto1.setId(chaveSequencial++);
		produto1.setNome("Bolacha");
		produto1.setDescricao("20g");
		produto1.setUnidadeCompra(1);
		produto1.setPrecoMaxComprado(1);
		produto1.setQtdPrevistoMes(50);
		lista.add(produto1);
		
		Produto produto2=new Produto();
		produto2.setId(chaveSequencial++);
		produto2.setNome("Feijao");
		produto2.setDescricao("Pacote 50g");
		produto2.setUnidadeCompra(1);
		produto2.setPrecoMaxComprado(6.8);
		produto2.setQtdPrevistoMes(10);
		lista.add(produto2);
		
	}	
	// adiciona produto
	public void adicionar(Produto produto) {
		produto.setId(Produtos.chaveSequencial++);
		Produtos.lista.add(produto);
	}
	// lista produto
	public List<Produto> getProdutos() {
		return Produtos.lista;
	}
	// remove produto
	public void removerProduto(long  id) {
		Iterator<Produto> it= lista.iterator();
		while(it.hasNext()){			
			Produto pdt=it.next();		
			if(pdt.getId()==id) {
				it.remove();
			}
			
		}
	}	
	//retorna empresas
	public Produto buscarProdutoPeloId(long id) {
		for(Produto produto:lista) {
			if(produto.getId()==id) {
				return produto;
			}
		}
		return null;		
	}
}
