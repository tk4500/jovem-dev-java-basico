package aula2.poo.exercicio4;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		Carro[] carros = new Carro[3];
		String msg = "Lista de carros:\n";
		for (Carro car : carros) {
			car = new Carro();
			car.modelo = JOptionPane.showInputDialog("Digite o modelo do carro");
			car.ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
			car.cor = JOptionPane.showInputDialog("Digite a cor do carro");
			msg += "Modelo: " + car.modelo + " |Ano: " + car.ano + " |Cor: " + car.cor + "\n";
		}
		JOptionPane.showMessageDialog(null, msg);

	}
}
