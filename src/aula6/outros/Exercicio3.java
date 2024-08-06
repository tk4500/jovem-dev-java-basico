package aula6.outros;

public class Exercicio3 {

	public static void main(String[] args) {
		new Exercicio3();
	}
	public Exercicio3() {
		int a = 5, b = 3;

		for (Calculadora2Enum c : Calculadora2Enum.values())
			System.out.println(c.calculo(a, b));

	}
}
