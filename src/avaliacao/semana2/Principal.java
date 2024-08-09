package avaliacao.semana2;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.personagens.Arok;
import avaliacao.semana2.personagens.Barbaro;
import avaliacao.semana2.personagens.Mago;
import avaliacao.semana2.personagens.Morcego;
import avaliacao.semana2.personagens.Paladino;
import avaliacao.semana2.personagens.Urso;
import avaliacao.semana2.personagens.Vampiro;
import avaliacao.semana2.personagens.Zumbi;

public class Principal {

	public static void main(String[] args) {
		List<Personagem> herois = new ArrayList<>();
		herois.add(new Mago());
		herois.add(new Barbaro());
		herois.add(new Paladino());
		StringBuilder msg = new StringBuilder();
		String tempmsg;
		for (Personagem h : herois) {
			tempmsg = resultadoBatalha(h);
			msg.append(h.getNome() + ": " + tempmsg + "\n");
			System.out.println(tempmsg);
		}
		System.out.println("Situação final:\n" + msg.toString());
	}

	public static String resultadoBatalha(Personagem desafiante) {
		if (batalhaCompleta(desafiante))
			return (String.format("%s é o grande campeão", desafiante.getNome()));
		else
			return (String.format("%s foi derrotado, tente novamente", desafiante.getNome()));
	}

	public static boolean batalhaCompleta(Personagem desafiante) {
		Personagem inimigo = new Morcego();
		if (desafiante.batalhar(inimigo) == 1) {
			inimigo = new Zumbi();
			if (desafiante.batalhar(inimigo) == 1) {
				inimigo = new Urso();
				if (desafiante.batalhar(inimigo) == 1) {
					inimigo = new Vampiro();
					if (desafiante.batalhar(inimigo) == 1) {
						inimigo = new Arok();
						if (desafiante.batalhar(inimigo) == 1) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
