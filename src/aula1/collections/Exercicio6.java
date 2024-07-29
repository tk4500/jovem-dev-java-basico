package aula1.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		new Exercicio6();
	}

	public Exercicio6() {
		Map<String, List<Double>> mapa = new HashMap<>();
		List<String> nomes = new ArrayList<>();
		String nome;
		for (int i = 0; i < 5; i++) {
			nome = JOptionPane.showInputDialog("Digite o nome do aluno");
			mapa.put(nome, new ArrayList<>());
			for (int j = 0; j < 3; j++) {
				mapa.get(nome).add(Double.parseDouble(JOptionPane.showInputDialog("Digite uma das notas do aluno")));
			}
		}
		nome = "Notas dos alunos:\n";
		nomes.addAll(mapa.keySet());
		for (int i = 0; i < 5; i++) {
			int media = 0;
			nome += nomes.get(i) + ": ";
			for (int j = 0; j < 3; j++) {
				nome += (mapa.get(nomes.get(i))).get(j) + "| ";
				media += (mapa.get(nomes.get(i))).get(j);
			}
			nome += "Media: " + (media / 3) + "\n";
		}
		JOptionPane.showMessageDialog(null, nome);
	}
}
