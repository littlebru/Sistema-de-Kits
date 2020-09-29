import java.util.ArrayList;

public class DiaDasMaes extends ProdutoComposto{	
		
	public DiaDasMaes() {
		
		this.produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("BOLSA DE COURO", "tamanho: 40cm\nPeso: 800g\nMaterial: couro\n", 78.40));
		produtos.add(new Produto("PERFUME KAQUI", "tamanho: 10cm\nPeso: 80g\nMarca: Kaqui", 45.00));
		produtos.add(new Produto("BOTA FEMININA PRETA", "Tamanho: 37cm\nMaterial: Couro\nMarca: Ortopé", 40.00));
		produtos.add(new Produto("BRINCO DE PRATA", "Tamanho: 7cm\nCor: Prata", 3.99));
		
		this.valor = 167.39;
	}
	
		

}
