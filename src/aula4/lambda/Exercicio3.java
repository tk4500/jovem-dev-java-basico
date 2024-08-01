package aula4.lambda;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Aluno> aluno = new ArrayList<>();
		String[] nome = { "Tarcísio", "Fabio", "Pedro", "Miranda", "Jaqueline" };
		String[] dataNascimento = { "01/01/2000", "02/03/1984", "30/04/3489", "02/02/2002", "01/01/0001" };
		int[] numeroChamada = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 5; i++)
			aluno.add(new Aluno(nome[i], numeroChamada[i], dataNascimento[i]));
		aluno.removeIf(a -> (a.nome.charAt(0) == 'T' && a.nome.toUpperCase().charAt(a.nome.length() - 1) == 'O'));
		aluno.forEach(a -> System.out.println(
				a.nome + ": numero " + a.numeroChamada + "º da chamada nascido em " + a.dataNascimento.toString()));
	}
}
