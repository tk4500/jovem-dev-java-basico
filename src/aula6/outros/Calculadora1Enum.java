package aula6.outros;


public enum Calculadora1Enum implements CalculoInterface{

	SOMA("soma"){
		 @Override
	        public int calcula(int a, int b) {
	            return a + b;
	        }
	},
	SUBTRACAO("subtração"){
		 @Override
	        public int calcula(int a, int b) {
	            return a - b;
	        }
	},
	DIVISAO("divisão"){
		 @Override
	        public int calcula(int a, int b) {
	            return a / b;
	        }
	},
	MULTIPLICACAO("multiplicação")
	{
		 @Override
	        public int calcula(int a, int b) {
	            return a * b;
	        }
	};

	private String nomeAmigavel;


	Calculadora1Enum(String string) {
		nomeAmigavel = string;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}

	@Override
	public int calcula(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
@FunctionalInterface interface CalculoInterface {
    int calcula(int a, int b);
}

