package aula2.poo.exercicio6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.JOptionPane;

import aula2.poo.exercicio5.Pessoa;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}
	 Principal() {
		 Pessoa pessoa1 = new Pessoa();
			pessoa1.nome = JOptionPane.showInputDialog("Digite o nome da 1ª pessoa");
			pessoa1.nascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite o aniversario desta pessoa"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			PessoaFisica pessoa2 = new PessoaFisica();
			pessoa2.nome = JOptionPane.showInputDialog("Digite o nome da 2ª pessoa");
			pessoa2.nascimento = LocalDate.parse(JOptionPane.showInputDialog("Digite o aniversario desta pessoa"), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			pessoa2.cpf = JOptionPane.showInputDialog("Digite o cpf");
			if (pessoa1.nascimento.isAfter(pessoa2.nascimento))
				JOptionPane.showMessageDialog(null, pessoa2.nome + " é mais velho(a), com "
						+ pessoa2.nascimento.until(LocalDate.now(), ChronoUnit.YEARS) + " Anos de idade e Cpf: " + pessoa2.cpf);
			else
				JOptionPane.showMessageDialog(null, pessoa1.nome + " é mais velho(a), com "
						+ pessoa1.nascimento.until(LocalDate.now(), ChronoUnit.YEARS) + " Anos de idade");
		

	}
}
