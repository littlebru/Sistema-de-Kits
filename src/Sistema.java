public class Sistema {

	public static void main(String[] args) {

		// Sem desconto
		CalculadorPreco semDesconto = new PrecoComum();
		Produto p1 = new ProdutoUnitario("CAMISETA", "Material: Algodão\nCor: Rosa Claro", 20.90);
		p1.valor = semDesconto.calculaValor(p1.getValor());
		semDesconto.imprimeValorTotal(p1);
		
		ProdutoComposto kit1 = new DiaDasMaes();
		kit1.valor = semDesconto.calculaValor(kit1.getValor());
		semDesconto.imprimeValorTotal(kit1);
		
		
		// Com desconto - 50%
		
		CalculadorPreco comDesconto = new Porcentagem(50);
		
		Produto p2 = new ProdutoUnitario("CAMISETA", "Material: Algodão\nCor: Rosa Claro", 20.90);
		p2.valor = comDesconto.calculaValor(p2.getValor());
		comDesconto.imprimeValorTotal(p2);
		
		ProdutoComposto kit3 = new DiaDasMaes();
		comDesconto.imprimeValorTotal(kit3);
		comDesconto.calculaValor(kit3.getValor());		
		
		
	}

}