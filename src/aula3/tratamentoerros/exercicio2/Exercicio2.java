package aula3.tratamentoerros.exercicio2;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		int n1 = 0, n2 = 0;
		boolean done = true;
		while (done) {
			try {
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero divisor"));
				done = false;
			} catch (NumberFormatException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Valor invalido");
			}
		}
		done = true;
		while (done) {
			try {
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero divisor"));
				if (n2 == 0)
					throw new ZeroException();
				done = false;
			} catch (NumberFormatException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Valor invalido");
			} catch (ZeroException e) {
				JOptionPane.showMessageDialog(null, e);

			}
		}
		JOptionPane.showMessageDialog(null, (n1 / n2));
	}
}
