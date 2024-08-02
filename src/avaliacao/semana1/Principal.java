package avaliacao.semana1;

import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeException;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		boolean done = false;
		Venda venda = new Venda(JOptionPane.showInputDialog("Digite o nome do Cliente"));
		while (!done) {
			try {
				venda.cliente.setDataNascimento(JOptionPane.showInputDialog("Digite a Data(utilize dd/mm/aaaa)"));
				done = true;
			} catch (DateTimeParseException e) {
				JOptionPane.showMessageDialog(null, "Valor de data invalido, tente novamente.");
			}
		}
		done = false;
		String nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");
		do {
			try {
				venda.novaVenda(nomeProduto);
			} catch (IllegalArgumentException | NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Valor invalido durante o cadastro de produto, digite novamente.");
			} catch (QuantidadeException e) {
				JOptionPane.showMessageDialog(null, "Quantidade de Produtos Invalida, digite novamente");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "erro inesperado:" + e + "\nChame o suporte para verificar");
			}
			nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto");

		} while (!nomeProduto.equals("fim"));
		venda.setFormaPagamento();
		System.out.println(venda.gerarCupom());

	}
}
