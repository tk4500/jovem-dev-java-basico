package avaliacao.semana2.exceptions;

import avaliacao.semana2.Personagem;

public class PersonagemDerrotadoException extends Exception {
	public PersonagemDerrotadoException(Personagem atacante, Personagem inimigo) {
		super(String.format("%s foi derrotado por %s", inimigo.getNome(), atacante.getNome()));
	}

	private static final long serialVersionUID = 1L;

}
