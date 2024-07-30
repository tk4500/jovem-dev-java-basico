package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		JOptionPane.showMessageDialog(null, (int) Double
				.parseDouble(JOptionPane.showInputDialog("Digite um numero com virgula").replace(',', '.')));
	}
}
