package aula5.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	
	public static void main(String[] args) {
		new Exercicio5();
	}
	public Exercicio5() {
		List<String> nomes = new ArrayList<>();
		String[] nome = {"Caio","Miguel","Priscilla","Tiffany","Pablo","Manito","Pedro","Adalberto","Betanio","Joliscreusa"};
		nomes = Arrays.asList(nome);
		System.out.println(nomes.stream().filter(p->p.endsWith("berto")).findFirst().orElseThrow(ZeroBertoException::new));
		
	}

}
