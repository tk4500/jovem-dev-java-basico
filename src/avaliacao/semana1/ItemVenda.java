package avaliacao.semana1;

public class ItemVenda {

	Produto produto = new Produto();
	double quantidade;
	public ItemVenda(String nome, double preco, double quantidade) {
		this.produto.nomeProduto = nome;
		this.produto.preco = preco;
		this.quantidade = quantidade;
	}
	@Override
	public String toString() {
		String msg = "";
		msg += this.produto.nomeProduto + " kg\n";
		msg += this.stringParse(String.format("%.2fx ", this.quantidade), String.format("%.2f", this.calculaTotal()).replace('.', ',')) + "\n";
		return msg;
	}
	
	public String stringParse(String front, String back) {
		String msg = front + back;
		if ((msg).length() < 32) 
			return stringParse((front + "."), back);
		else 
		return msg + "\n";
	}
	
	public double calculaTotal() {
		return this.produto.preco*this.quantidade;
	}

}
