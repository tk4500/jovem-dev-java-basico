package aula7.testes.desafio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}
public Desafio() {
	List<Evento> eventos = new ArrayList<>();
	eventos.add(new Evento("Chibata", LocalDateTime.parse("2007-12-03T10:15:30."), 1));
	eventos.add(new Evento("AnimeFriends", LocalDateTime.parse("2025-11-05T12:30:30."), 2));
	eventos.add(new Evento("Latinoware", LocalDateTime.parse("2023-05-10T10:15:30."), 3));
	eventos.add(new Evento("Babbou", LocalDateTime.parse("2007-12-03T10:15:30."), 4));
	String resposta = JOptionPane.showInputDialog("Digite um tipo de evento entre, Social, Lazer, Profissional e Outros").toLowerCase();
	switch(resposta) {
	case "social":
	case "lazer":
	case "profissional":
	case "outros":
		System.out.println("Eventos que ainda não ocorreram:");
		eventos.stream().filter(e -> e.evento.name().equals(resposta.toUpperCase())).filter(e -> e.dataHora.isAfter(LocalDateTime.now())).forEach(e->System.out.println(e.descricao + "\n"));
		System.out.println("Eventos que ja ocorreram:");
		eventos.stream().filter(e -> e.evento.name().equals(resposta.toUpperCase())).filter(e -> e.dataHora.isBefore(LocalDateTime.now())).forEach(e->System.out.println(e.descricao + "\n"));
		break;
	default:
		JOptionPane.showMessageDialog(null, "resposta incorreta, tente novamente");
	}
}	
	
}
