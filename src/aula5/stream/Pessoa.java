package aula5.stream;

import java.time.LocalDate;

public class Pessoa {

	String nome, telefone;
	LocalDate dataNascimento;
	
	public Pessoa(String nome, String telefone,LocalDate dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
	}
	public String getNome() {
		return this.nome;
	}

}
