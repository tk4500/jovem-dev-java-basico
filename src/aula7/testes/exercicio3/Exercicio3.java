package aula7.testes.exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Integer> lista = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 50; i++)
			lista.add(random.nextInt(100));
		System.out.println(
				lista.stream().mapToInt(Integer::valueOf).filter(i -> i==25).count());
	}
}
