import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ProdutoComposto extends Produto{
	
	protected List<Produto> produtos;
	
	public ProdutoComposto() {
		this.produtos = new ArrayList<Produto>();
	}
	
	public List<Produto> getItens() {
		return Collections.unmodifiableList(produtos);	// esta lista não sera alterada por terceiros
	}
	
	public void adicionaItem(Produto item) {
		produtos.add(item);
	}
}