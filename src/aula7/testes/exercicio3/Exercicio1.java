package aula7.testes.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		List<Integer> lista = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++)
			lista.add(random.nextInt(100));
		System.out.println(lista.stream().mapToInt(i->i).sum());
	}
}
