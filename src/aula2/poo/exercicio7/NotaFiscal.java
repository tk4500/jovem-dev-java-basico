package aula2.poo.exercicio7;

public class NotaFiscal {
	String emitente;
	private double valor;
	
	public void calculaValor(double preço, double desconto) {
		this.valor = preço-desconto;
	}
	
	public double getValor() {
		return this.valor;
	}
	public NotaFiscal(String emitente) {
		this.emitente = emitente;
	}
}
