package aula6.outros;

import java.util.function.BiFunction;

public enum Calculadora2Enum {
	SOMA("soma", (a, b) -> a + b), SUBTRACAO("subtração", (a, b) -> a - b), DIVISAO("divisão", (a, b) -> a / b),
	MULTIPLICACAO("multiplicação", (a, b) -> a * b);

	private String nomeAmigavel;
	private BiFunction<Integer, Integer, Integer> calculo;

	Calculadora2Enum(String string, BiFunction<Integer, Integer, Integer> CalInter) {
		calculo = CalInter;
		nomeAmigavel = string;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	public int calculo(int a, int b) {
		return calculo.apply(a, b);
	}


}
