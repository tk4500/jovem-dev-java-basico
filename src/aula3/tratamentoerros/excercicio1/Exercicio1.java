package aula3.tratamentoerros.excercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		Integer inteiro = null;
		while (inteiro == null) {
			try {
				inteiro = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Você digitou um valor não reconhecido");
			}
		}
		JOptionPane.showMessageDialog(null, inteiro);
	}
}
