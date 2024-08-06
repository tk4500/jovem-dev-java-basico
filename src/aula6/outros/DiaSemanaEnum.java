package aula6.outros;

public enum DiaSemanaEnum {
	SEGUNDA("Segunda-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	TERCA("Terça-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	QUARTA("Quarta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	QUINTA("Quinta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	SEXTA("Sexta-feira") {
		@Override
		public boolean isFimDeSemana() {
			return false;
		}
	},
	SABADO("Sabado") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	},
	DOMINGO("Domingo") {
		@Override
		public boolean isFimDeSemana() {
			return true;
		}
	};
	
	
	private String nome;
	public abstract boolean isFimDeSemana();
	private DiaSemanaEnum(String name) {
		nome = name;
	}
	public String getNome() {
		return nome;
	}
}
