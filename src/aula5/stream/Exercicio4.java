package aula5.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio4 {
	
	public static void main(String[] args) {
		new Exercicio4();
	}
	public Exercicio4() {
		List<Pessoa> pessoas = new ArrayList<>();
		String[] nome = {"Caio","Miguel","Priscilla","Tiffany","Pablo","Manito","Pedro","Adalberto","Betanio","Joliscreusa"};
		String[] telefone = {"99934-7855","99754-7855","93534-7555","99963-7855","96934-7955","99925-7125","99934-2355","94934-7755","99534-7855","91934-7255"};
		LocalDate[] dataNascimento = {LocalDate.parse("2006-04-30"),LocalDate.parse("2007-03-15"),LocalDate.parse("2005-04-21"),LocalDate.parse("2006-06-11"),LocalDate.parse("2003-03-15"),LocalDate.parse("2007-04-30"),LocalDate.parse("1689-02-21"),LocalDate.parse("1687-08-10"),LocalDate.parse("1975-12-19"),LocalDate.parse("2015-10-01"),};
		for(int i=0;i<10;i++) 
			pessoas.add(new Pessoa(nome[i],telefone[i],dataNascimento[i]));
		System.out.println(pessoas.stream().filter(p->p.dataNascimento.getMonthValue() == 4).map(Pessoa::getNome).sorted().collect(Collectors.joining(", ")));
		
	}

}
