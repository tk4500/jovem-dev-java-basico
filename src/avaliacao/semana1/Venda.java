package avaliacao.semana1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeException;

public class Venda {
	Cliente cliente;
	List<ItemVenda> itens = new ArrayList<>();
	int formaPagamento;

	public Venda(String nome) {
		if (nome.equals("Thiago"))
			cliente = new ClientePremium(nome);
		else
			cliente = new Cliente(nome);
	}

	public void novaVenda(String nome) throws Exception {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto"));
		double quantidade = Double
				.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de produtos que você deseja levar"));
		if (quantidade < 0 || quantidade > 50)
			throw new QuantidadeException();
		this.itens.add(new ItemVenda(nome, preco, quantidade));
	}

	public double desconto(double valor) {
		if (this.cliente.aniversario())
			return 0.7 * valor;
		if (this.cliente.premium())
			return 0.8 * valor;
		if (this.cliente.terceiraIdade())
			return 0.9 * valor;
		return 1 * valor;

	}

	public boolean desconto() {
		if (this.cliente.aniversario()) {
			return true;
		} else if (this.cliente.premium()) {
			return true;
		} else if (this.cliente.terceiraIdade()) {
			return true;
		}
		return false;

	}

	public String gerarDesconto() {
		if (this.cliente.aniversario())
			return "Descto. 30% Aniversario\n\n";
		if (this.cliente.premium())
			return "Descto. 20% Cliente Premium\n\n";
		return "Descto. 10% Terceira Idade\n\n";
	}

	public String getFormaPagamento() {
		switch (this.formaPagamento) {
		case 1:
			return "Cartão de Crédito";
		case 2:
			return "Cartão de Débito";
		case 3:
			return "Dinheiro";
		default:
			return "Metodo de pagamento invalido";
		}
	}

	public void setFormaPagamento() {
		int fPagamento;
		try {
			fPagamento = Integer.parseInt(JOptionPane.showInputDialog(
					"Digite a forma de pagamento:\n1:Cartão de Crédito\n2:Cartão de Débito\n3:Dinheiro"));
		} catch (Exception e) {
			fPagamento = -1;
		}

		if (fPagamento < 0 || fPagamento > 3) {
			JOptionPane.showMessageDialog(null, "forma de pagamento invalida, digite novamente");
			this.setFormaPagamento();
		} else
			this.formaPagamento = fPagamento;
	}

	public String gerarCupom() {
		StringBuilder msg = new StringBuilder();
		msg.append("************ CUPOM ************\n\n");
		this.itens.forEach(i -> msg.append(i.toString()));
		msg.append(this.subTotal());
		if(this.desconto())
			msg.append(this.gerarDesconto());
		msg.append(this.stringParse("Total",String.format("%.2f",this.desconto(this.calculaSubTotal(itens)))) + "\n");
		msg.append("Forma de pagamento:" + this.getFormaPagamento() + "\n");
		msg.append("Cliente: " + this.cliente.nomeAnonimo());
		return msg.toString();
	}

	public String subTotal() {
		String msg = this.stringParse("SubTotal", String.format("%.2f", this.calculaSubTotal(this.itens))) ;
		return msg;
	}

	public String stringParse(String front, String back) {
		String msg = front + back;
		if ((msg).length() < 32) 
			return stringParse((front + "."), back);
		else 
		return msg + "\n";
	}

	public double calculaSubTotal(List<ItemVenda> itens) {
		double subTotal = 0;
		for (ItemVenda item : itens)
			subTotal += item.calculaTotal();
		return subTotal;
	}

}
