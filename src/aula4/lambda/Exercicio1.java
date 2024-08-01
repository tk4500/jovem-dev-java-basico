package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		Random r = new Random();
		List<Double> d = new ArrayList<>();
		for(int i=0;i<50;i++) d.add(r.nextDouble());
		d.forEach(System.out::println);
	}
}
