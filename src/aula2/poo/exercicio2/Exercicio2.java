package aula2.poo.exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		String frase1 = JOptionPane.showInputDialog("Digite a 1ª frase");
		String frase2 = JOptionPane.showInputDialog("Digite a 2ª frase");
		if (frase1.equals(frase2))
			JOptionPane.showMessageDialog(null, "As frases são iguais, e tem tamanho " + frase1.length());
		else
			JOptionPane.showMessageDialog(null, "As frases não são iguais, a frase 1 tem tamanho " + frase1.length()
					+ " enquanto a frase 2 tem " + frase2.length());
	}
}
