package aula6.outros;

public class Exercicio2 {

	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		int a = 5, b = 5;

		for (Calculadora1Enum c : Calculadora1Enum.values())
			System.out.println(c.calcula(a, b));

	}
}
