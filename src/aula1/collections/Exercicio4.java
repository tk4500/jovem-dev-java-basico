package aula1.collections;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercicio4 {

	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		String frase = JOptionPane.showInputDialog("Digite a frase");
		Map<Character, Integer> mapa = new HashMap<>();
		List<Character> caracteres = new ArrayList<>();
		for (int i = 0; i < frase.length(); i++) {
			if (mapa.containsKey(frase.charAt(i)))
				mapa.put(frase.charAt(i), (mapa.get(frase.charAt(i)) + 1));
			else
				mapa.put(frase.charAt(i), 1);
		}
		frase = "Resultado: \n|";
		caracteres.addAll(mapa.keySet());
		for (char c : caracteres)
			frase += c + " - " + mapa.get(c) + " | ";
		JOptionPane.showMessageDialog(null, frase);

	}
}
