package aula4.lambda.exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Aluno {

	public int numeroChamada;
	public String nome;
	public LocalDate dataNascimento;

	public Aluno(String nome, int numeroChamada, String dataNascimento) {
		this.nome = nome;
		this.numeroChamada = numeroChamada;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
