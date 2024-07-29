package aula1.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.JOptionPane;

public class Desafio {

	public static void main(String[] args) {
		new Desafio();
	}

	public Desafio() {
		Map<Character, List<String>> mapa = new HashMap<>();
		List<String> palavras = new ArrayList<>();
		String palavra;
		Set<Character> vogais = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra");
			palavras.add(palavra);
		} while (!palavra.equals("fim"));
		for (char c : vogais) {
			mapa.put(c, new ArrayList<>());
			for (String p : palavras)
				if (p.indexOf(c) != -1)
					mapa.get(c).add(p);
			Collections.sort(mapa.get(c));
		}
		palavra = "Ordenamento das letras:\n";
		for (char c : vogais) {
			palavra += c + ": ";
			for (String p : mapa.get(c))
				palavra += p + ", ";
			palavra += "\n";
		}
		JOptionPane.showMessageDialog(null, palavra);

	}
}
