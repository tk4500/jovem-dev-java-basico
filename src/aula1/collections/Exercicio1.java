package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		List<Integer> numeros = new ArrayList<>();
		Random random = new Random();
		String msg = "";
		for (int i = 0; i < 50; i++)
			numeros.add(random.nextInt(101));
		Collections.sort(numeros);
		for (int num : numeros)
			msg += num + " ";
		JOptionPane.showMessageDialog(null, msg);
	}
}
