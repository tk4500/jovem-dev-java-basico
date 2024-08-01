package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

	int numeroChamada;
	String nome;
	LocalDate dataNascimento;

	public Aluno(String nome, int numeroChamada, String dataNascimento) {
		this.nome = nome;
		this.numeroChamada = numeroChamada;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
