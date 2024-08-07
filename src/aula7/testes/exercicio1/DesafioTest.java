package aula7.testes.exercicio1;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DesafioTest {
	private List<Pessoa> pessoas ;
	private Desafio desafio;
	
	@BeforeEach
	void setup() {
		pessoas = new ArrayList<>();
		desafio = new Desafio();
		
	}
	@DisplayName("Se a Lista Estiver Vazia, deve retornar vazio")
	@Test
	void listaVaziaRetornaVazia() {
		
		assertEquals("",String.join(", ", desafio.vogalOrdemReversa(pessoas)));
	}
	@DisplayName("Se a Lista Tiver elementos, retornar apenas aqueles com nomes iniciados por vogais")
	@Test
	void listaComElementosRetornaNomesVogal() {
		pessoas.add(new Pessoa("Ursula", "48 99944-2746", LocalDate.parse("2006-04-30")));
		pessoas.add(new Pessoa("Aurelio", "48 99944-2746", LocalDate.parse("2006-04-30")));
		pessoas.add(new Pessoa("Jamelão", "48 99944-2746", LocalDate.parse("2006-04-30")));
		pessoas.add(new Pessoa("Emilio", "48 99944-2746", LocalDate.parse("2006-04-30")));
		assertEquals("Ursula, Emilio, Aurelio",String.join(", ", desafio.vogalOrdemReversa(pessoas)));
	}

}
