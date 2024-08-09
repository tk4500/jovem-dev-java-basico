package avaliacao.semana2;

import java.util.Random;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {
	private PersonagemEnum personagem;
	int hp;
	Random dice = new Random();

	public Personagem(PersonagemEnum personagem) {
		this.personagem = personagem;
		this.hp = personagem.getMaxHP();
	}

	public int batalhar(Personagem inimigo) {
		int winner = 0;
		do {
			try {
				System.out.println(this.atacar(inimigo));

				try {
					System.out.println(inimigo.atacar(this));
					System.out.println();
				} catch (PersonagemDerrotadoException e) {
					System.out.println(e.getLocalizedMessage());
					winner = 2;
				}
			} catch (PersonagemDerrotadoException e) {
				System.out.println(e.getLocalizedMessage());
				winner = 1;
			}
		} while (winner == 0);
		return winner;

	}

	public String atacar(Personagem inimigo) throws PersonagemDerrotadoException {
		int dano = this.getAtaque() - inimigo.getDefesa() + dice.nextInt(5) + 1;
		if (dano > 0) {
			if (dano >= inimigo.hp)
				throw new PersonagemDerrotadoException(this, inimigo);
			else {
				inimigo.hp = inimigo.getHp() - dano;
				return String.format("%s tomou %d de dano, vida atual: %d/%d", inimigo.getNome(), dano, inimigo.hp,
						inimigo.getMaxHP());
			}
		} else
			return String.format("Ataque de %s falhou\n", this.getNome());
	}

	public String getNome() {
		return this.personagem.getNome();
	}

	public int getHp() {
		return hp;
	}

	public int getMaxHP() {
		return this.personagem.getMaxHP();
	}

	public int getAtaque() {
		return this.personagem.getAtaque();
	}

	public int getDefesa() {
		return this.personagem.getDefesa();
	}
}
