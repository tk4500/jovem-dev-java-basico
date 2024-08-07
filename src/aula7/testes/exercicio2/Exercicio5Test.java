package aula7.testes.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import aula5.stream.exceptions.ZeroBertoException;

class Exercicio5Test {
	private List<String> nomes;
	private Exercicio5 exercicio;
	@BeforeEach
	void setup() {
		nomes = new ArrayList<>();
		exercicio = new Exercicio5();
	}
	
	@DisplayName("Se a lista estiver vazia, deve disparar ZeroBertoException")
	@Test
	void deveDispararExcessaoSeListaVazia() {
		assertThrows(ZeroBertoException.class, ()-> exercicio.getNomesBerto(nomes) );
	}
	@DisplayName("Se a lista tiver um null e tiver um berto depois, ler o primeiro berto")
	@Test
	void deveTrazerOPrimeiroBerto() {
		nomes.add(null);
		nomes.add("Alberto");
		nomes.add("Adalberto");
		
		String retorno = exercicio.getNomesBerto(nomes);
		
		assertEquals("Alberto", retorno);
	}
	@DisplayName("Se houver um berto, trazer aquele elemento")
	@Test
	void test() {
		nomes.add("João");
		nomes.add("Pedro");
		nomes.add("Adalberto");
		String retorno = exercicio.getNomesBerto(nomes);
		assertEquals("Adalberto", retorno);
	}

}
