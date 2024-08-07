package aula7.testes.exercicio5;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		new Exercicio5();
	}
	public Exercicio5() {
		BigDecimal circunferencia = new BigDecimal(JOptionPane.showInputDialog("Digite a circunferencia do Circulo"));
		System.out.println(circunferencia.divide(BigDecimal.valueOf(Math.PI*2), 4 , RoundingMode.HALF_EVEN));
	}
}
