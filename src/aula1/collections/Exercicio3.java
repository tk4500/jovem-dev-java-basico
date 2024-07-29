package aula1.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		Set<Integer> conjunto = new HashSet<>();
		String msg = "Original:\n";
		for (int i = 0; i < 50; i++) {
			numeros.add(random.nextInt(21));
			msg += numeros.get(i) + " ";
		}
		msg += "\nSem Repetição:\n";
		conjunto.addAll(numeros);
		numeros.clear();
		numeros.addAll(conjunto);
		for (int n : numeros)
			msg += n + " ";
		JOptionPane.showMessageDialog(null, msg);
	}
}
