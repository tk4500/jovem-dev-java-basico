package aula6.outros;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import aula5.stream.Pessoa;

public class Exercicio4 {

	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		Pessoa p1 = new Pessoa("Natanael", "(48) 99923-4365", LocalDate.of(2010, 12, 25));
		Pessoa p2 = new Pessoa("Jailson", "(48) 99933-4325", LocalDate.of(2002, 06, 9));
	
		if(p1.getDataNascimento().isAfter(p2.getDataNascimento()))
			System.out.printf("Nome: %s\nData de Nascimento %s\nTelefone:%s", p1.getNome(),p1.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),p1.getTelefone());
		else
			System.out.printf("Nome: %s\nData de Nascimento %s\nTelefone:%s", p2.getNome(),p2.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),p2.getTelefone());
	}
}
