package aula1.collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		new Exercicio5();
	}

	public Exercicio5() {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		Random random = new Random();
		String msg = "Conjunto 1: ";
		System.out.println(conjunto1.size());
		while (conjunto1.size() < 10) 
			conjunto1.add(random.nextInt(31));
		while (conjunto2.size() < 10) 
			conjunto2.add(random.nextInt(31));
		for (int c : conjunto1) 
			msg += c + ", ";
		msg = msg.substring(0, (msg.length() - 2));
		msg += "\nConjunto 2: ";
		for (int c : conjunto2) 
			msg += c + ", ";
		msg = msg.substring(0, (msg.length() - 2));
		msg += "\nIntersecção: ";
		conjunto1.retainAll(conjunto2);
		for (int c : conjunto1) 
			msg += c + ", ";
		msg = msg.substring(0, (msg.length() - 2));
		JOptionPane.showMessageDialog(null, msg);
	}
}
