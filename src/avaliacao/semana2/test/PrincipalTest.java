package avaliacao.semana2.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import avaliacao.semana2.Personagem;
import avaliacao.semana2.Principal;
import avaliacao.semana2.exceptions.PersonagemDerrotadoException;
import avaliacao.semana2.personagens.Mago;
import avaliacao.semana2.personagens.Morcego;
import avaliacao.semana2.personagens.Teste;
import avaliacao.semana2.personagens.Urso;
import avaliacao.semana2.personagens.Zumbi;

class PrincipalTest {
	Personagem heroi;
	Personagem inimigo;

	@BeforeEach
	void setup() {
		heroi = new Teste();
		inimigo = new Morcego();

	}

	@Test
	@DisplayName("Testa se a batalha Completa foi ganha")
	void testBatalhaCompletaGanha() {
		assertEquals(true, Principal.batalhaCompleta(heroi));
	}

	@Test
	@DisplayName("Testa se a batalha Completa foi Perdida")
	void testBatalhaCompletaPerdida() {
		assertEquals(false, Principal.batalhaCompleta(inimigo));
	}

	@Test
	@DisplayName("Testa se a batalha Completa da NullPointerException se o heroi for nulo")
	void testBatalhaCompletaHeroiNull() {
		heroi = null;
		assertThrows(NullPointerException.class, () -> Principal.batalhaCompleta(heroi));
	}

	@Test
	@DisplayName("Testa se a batalha Completa da NullPointerException se o inimigo for nulo")
	void testBatalhaCompletaInimigoNull() {
		inimigo = null;
		assertThrows(NullPointerException.class, () -> Principal.batalhaCompleta(inimigo));
	}

	@Test
	@DisplayName("Testa qual a resposta do resultado da batalha quando ganha")
	void testResultadoBatalhaVitoria() {
		assertEquals("test character é o grande campeão", Principal.resultadoBatalha(heroi));
	}

	@Test
	@DisplayName("Testa qual a resposta do resultado da batalha quando perdida")
	void testResultadoBatalhaDerrota() {
		assertEquals("Você perdeu, não foi desta vez", Principal.resultadoBatalha(inimigo));
	}

	@Test
	@DisplayName("Testa se o resultado Batalha da NullPointerException se o inimigo for nulo")
	void testResultadoBatalhaInimigoNull() {
		inimigo = null;
		assertThrows(NullPointerException.class, () -> Principal.resultadoBatalha(inimigo));
	}

	@Test
	@DisplayName("Testa se o resultado Batalha da NullPointerException se o heroi for nulo")
	void testResultadoBatalhaHeroiNull() {
		heroi = null;
		assertThrows(NullPointerException.class, () -> Principal.resultadoBatalha(heroi));
	}

	@Test
	@DisplayName("Testa se a Excessão PersonagemDerrotadoException ativa quando o inimigo é derrotado")
	void testAtacarPersonagemDerrotadoException() {
		assertThrows(PersonagemDerrotadoException.class, () -> heroi.atacar(inimigo));
	}

	@Test
	@DisplayName("Testa se o Ataque falha")
	void testAtacarFalha() {
		heroi = new Mago();
		try {
			assertEquals("Ataque de Morcego falhou\n", inimigo.atacar(heroi));
		} catch (PersonagemDerrotadoException e) {
		}

	}

	@Test
	@DisplayName("Testa se o Ataque da dano")
	void testAtacarDano() {
		heroi = new Mago();
		inimigo = new Urso();
		try {
			int dano = inimigo.getHp();
			String a = heroi.atacar(inimigo);
			dano = dano - inimigo.getHp();
			assertEquals(String.format("%s tomou %d de dano, vida atual: %d/%d", inimigo.getNome(), dano,
					inimigo.getHp(), inimigo.getMaxHP()), a);
		} catch (PersonagemDerrotadoException e) {
		}

	}

	@Test
	@DisplayName("Testa a condição de vitoria do heroi")
	void testBatalharVitoria() {
		heroi = new Mago();
		inimigo = new Zumbi();
		assertEquals(1, heroi.batalhar(inimigo));

	}

	@Test
	@DisplayName("Testa a condição de derrota do heroi")
	void testBatalharDerrota() {
		heroi = new Mago();
		inimigo = new Teste();
		assertEquals(2, heroi.batalhar(inimigo));
	}

	@Test
	@DisplayName("Teste heroi nulo em batalha")
	void testBatalhaHeroiNull() {
		heroi = null;
		assertThrows(NullPointerException.class, () -> heroi.batalhar(inimigo));
	}

	@Test
	@DisplayName("Teste inimigo nulo em batalha")
	void testBatalhaInimigoNull() {
		inimigo = null;
		assertThrows(NullPointerException.class, () -> heroi.batalhar(inimigo));
	}

	@Test
	@DisplayName("Teste inimigo nulo em ataque")
	void testAtaqueInimigoNull() {
		inimigo = null;
		assertThrows(NullPointerException.class, () -> heroi.atacar(inimigo));
	}

	@Test
	@DisplayName("Teste heroi nulo em ataque")
	void testHeroiInimigoNull() {
		heroi = null;
		assertThrows(NullPointerException.class, () -> heroi.atacar(inimigo));
	}
	/*
	 * @Test void puxaPersonagemTest() { new Principal(); }
	 */
}
