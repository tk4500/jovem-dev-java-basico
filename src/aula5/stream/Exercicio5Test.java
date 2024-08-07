package aula5.stream;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcessaoSeListaVazia() {
		List<String> nomes = new ArrayList<>();
		Exercicio5 exercicio = new Exercicio5();
		
		assertThrows(ZeroBertoException.class, ()-> exercicio.getBerto(nomes) );
	}
	@DisplayName("Se a lista tiver um null e tiver um berto depois, ler o primeiro berto")
	@Test
	void deveTrazerOPrimeiro() {
		List<String> nomes = new ArrayList<>();
		Exercicio5 exercicio = new Exercicio5();
		nomes.add(null);
		nomes.add("Alberto");
		nomes.add("Adalberto");
		
		String retorno = exercicio.getBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	@DisplayName("Se não houver berto, disparar ZeroBertoException")
	@Test
	void test() {
		List<String> nomes = new ArrayList<>();
		Exercicio5 exercicio = new Exercicio5();
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Adalbreto");
		
		assertThrows(ZeroBertoException.class, ()-> exercicio.getBerto(nomes) );
	}

}
