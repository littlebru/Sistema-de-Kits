
public class Produto {
	
	protected String nome;
	protected String descricao;
	protected double valor;
	private CalculadorPreco cp;
	
	public Produto() {}
	
	public Produto(String nome, String descricao, double valor) {
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	};

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}
	
}
