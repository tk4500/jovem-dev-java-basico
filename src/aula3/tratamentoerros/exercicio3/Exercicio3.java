package aula3.tratamentoerros.exercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {

		try {
			int i = 1 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			String a = null;
			@SuppressWarnings("null")
			boolean b = a.equals("batata");
			System.out.println(b + a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			char c = "b".charAt(1);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			List<Boolean> a = new ArrayList<>();
			a.add(false);
			Iterator<Boolean> b = a.iterator();
			b.remove();

		} catch (IllegalStateException e) {
			e.printStackTrace();
		}

	}
}
