import java.util.ArrayList;

public class DiaDosPais extends ProdutoComposto{
	
	public DiaDosPais() {
		
		this.produtos = new ArrayList<Produto>();
		
		produtos.add(new Produto("CAMISETA", "Material: Algodão\nCor: Rosa Claro", 20.90));
		produtos.add(new Produto("PULSEIRA", "Material: Couro", 10.00));
		produtos.add(new Produto("CANECA", "Altura: 10cm\nCor: Branca", 20.00));
		
		this.valor = 50.90;
	}

}
