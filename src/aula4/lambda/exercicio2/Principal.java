package aula4.lambda.exercicio2;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		boolean done = false;
		List<Aluno> aluno = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			while (!done)
				try {
					aluno.add(new Aluno(JOptionPane.showInputDialog("Digite o nome do aluno"),
							Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da chamada do Aluno")),
							JOptionPane.showInputDialog("Digite a data de nascimento do aluno (dd/mm/aaaa)")));
					done = true;
				} catch (Exception e) {
					e.printStackTrace();
				}
			done = false;
		}

		aluno.sort((a1, a2) -> a1.dataNascimento.compareTo(a2.dataNascimento));
		aluno.forEach(a -> System.out.println(
				a.nome + ": numero " + a.numeroChamada + "º da chamada nascido em " + a.dataNascimento.toString()));

	}

}
