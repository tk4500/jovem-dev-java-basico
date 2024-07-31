package aula3.tratamentoerros.desafio;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;

public class Item {

	private double preco;
	private String nome;

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0)
			throw new PrecoIncorretoException();
		else
			this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
