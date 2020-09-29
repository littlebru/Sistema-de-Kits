
public abstract class Desconto extends CalculadorPreco{
	
	protected double valorDesconto;

	public Desconto(double valorDesconto) {
		this.valorDesconto = valorDesconto;
	}
	
	public double getValorDesconto() {
		return valorDesconto;
	}
	
	public abstract double calculaValor(double valor);
}

