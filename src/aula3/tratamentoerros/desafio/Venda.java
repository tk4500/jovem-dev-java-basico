package aula3.tratamentoerros.desafio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Venda {

	String nomeCliente;
	List<Item> itens = new ArrayList<>();

	public Venda(String nome, int quantidade) throws VendaException {
		boolean done = true;
		if (quantidade < 1 || quantidade > 10)
			throw new VendaException();
		else {
			for (int i = 0; i < quantidade; i++) {
				Item item = new Item();
				this.nomeCliente = nome;
				while (done) {
					try {
						item.setNome(JOptionPane.showInputDialog("Digite o nome do item"));
						done = false;
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}

				}
				done = true;
				while (done) {
					try {
						item.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item")));
						done = false;
					} catch (PrecoIncorretoException e) {
						JOptionPane.showMessageDialog(null, e);
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, e);
					}

				}
				done = true;
				itens.add(item);
			}
		}

	}
}
