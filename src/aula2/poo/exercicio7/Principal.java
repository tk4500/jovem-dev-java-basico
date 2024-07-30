package aula2.poo.exercicio7;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	public Principal() {
		NotaFiscal nota1 = new NotaFiscal(JOptionPane.showInputDialog("Digite o nome do emitente da nota"));
		nota1.calculaValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota")), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto")));
		NotaFiscal nota2 = new NotaFiscal(JOptionPane.showInputDialog("Digite o nome do emitente da nota"));
		nota2.calculaValor(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota")), Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do desconto")));
	}
}
