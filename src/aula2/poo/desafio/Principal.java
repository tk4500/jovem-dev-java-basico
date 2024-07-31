package aula2.poo.desafio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<Carro> carro = new ArrayList<>();
		Carro lerCarro;
		do {
			lerCarro = new Carro();
			lerCarro.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
			if (!lerCarro.modelo.equals("fim")) {
				lerCarro.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
				carro.add(lerCarro);
			}
		} while (!lerCarro.modelo.equals("fim"));
		carro.sort((c1, c2) -> Integer.compare(c1.ano, c2.ano));
		for (Carro car : carro)
			System.out.println(car.modelo + " " + car.ano);
	}
}
