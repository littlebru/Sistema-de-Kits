
public class Porcentagem extends Desconto{
	
	private double taxa;

	public Porcentagem(double valorTaxa) {
		super(valorTaxa);
		this.taxa = valorTaxa;
		this.valorDesconto = valorTaxa/100;
	}
	
	@Override
	public double calculaValor(double valorProduto) {
		return valorProduto - (valorProduto * valorDesconto);
	}

	@Override
	public void imprimeValorTotal(Produto produto) {
		System.out.println("------------- NOTA FISCAL --------------\n");
		System.out.println("   Preco: R$ " + produto.getValor());
		
		System.out.println("   Desconto: " + taxa + "%");

		System.out.println("-----------------------------------------\n");
		System.out.println("   Total à Pagar: R$ "+ calculaValor(produto.getValor()));
		System.out.println("-----------------------------------------\n");
		
	}
	
}