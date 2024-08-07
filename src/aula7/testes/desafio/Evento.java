package aula7.testes.desafio;

import java.time.LocalDateTime;

public class Evento {

	String descricao;
	LocalDateTime dataHora;
	eventoEnum evento;
	public Evento(String desc, LocalDateTime dataEHora, int eNum) {
		descricao = desc;
		dataHora = dataEHora;
		switch(eNum) {
		case 1:
			evento = eventoEnum.SOCIAL;
			break;
		case 2:
			evento = eventoEnum.PROFISSIONAL;
			break;
		case 3:
			evento = eventoEnum.LAZER;
			break;
		case 4:
			evento = eventoEnum.OUTROS;
			break;
		}

	}
}

enum eventoEnum{
	SOCIAL, LAZER, PROFISSIONAL, OUTROS;
	
}
