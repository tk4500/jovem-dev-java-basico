package aula4.lambda.desafio;

import java.util.ArrayList;
import java.util.List;

public class Principal implements Mostrador {

	public static void main(String[] args) {
		new Principal();
	}

	public Principal() {
		List<String> lista = new ArrayList<>();
		String[] string = {"marcio", "felipe", "amero", "julio", "fabio"};
		for(int i=0;i<5;i++) lista.add(string[i]);
		lista.forEach(l -> Mostra(l));

	}
}
