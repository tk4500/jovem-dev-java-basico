package aula3.tratamentoerros.desafio;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		try {
			@SuppressWarnings("unused")
			Venda venda = new Venda(JOptionPane.showInputDialog("Digite o nome do Cliente"),
					Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de itens a serem cadastrados")));
			String msg = venda.nomeCliente + ":\n";
			for (Item item : venda.itens) {
				msg += item.getNome() + ": R$" + String.format("%.2f", item.getPreco()) + "\n";
			}
			System.out.println(msg);

		} catch (VendaException e) {
			e.printStackTrace();
		}
	}
}
