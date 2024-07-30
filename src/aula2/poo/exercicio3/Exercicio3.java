package aula2.poo.exercicio3;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		String dia = JOptionPane.showInputDialog("Digite a data");
		dia = dia.substring(6, 10) + "-" + dia.substring(3, 5) + "-" + dia.substring(0, 2);
		LocalDate data = LocalDate.parse(dia);
		JOptionPane.showMessageDialog(null, data.getDayOfWeek());
	}

}
