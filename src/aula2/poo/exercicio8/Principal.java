package aula2.poo.exercicio8;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Automovel carro = new Automovel();
		carro.nome = "Chevrolet";
		carro.cor = "Prata";
		carro.velocidade = 50;
		carro.Acelerar();
	}
}
