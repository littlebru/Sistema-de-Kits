
public class PrecoComum extends CalculadorPreco{

	@Override
	public double calculaValor(double valor) {
		return valor;
	}

	@Override
	public void imprimeValorTotal(Produto produto) {
		System.out.println("------------- NOTA FISCAL --------------\n");
		System.out.println("   Preco: R$ " + produto.getValor());
		
		System.out.println("   Sem Desconto!");
		
		System.out.println("-----------------------------------------\n");
		System.out.println("   Total à Pagar: R$ "+ produto.getValor());
		System.out.println("-----------------------------------------\n");
		
	}

}
