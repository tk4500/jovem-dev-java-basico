package aula4.lambda.desafio;

public interface Mostrador {

	default void Mostra(String a) {
		System.out.println(a.toUpperCase());
	}
}
