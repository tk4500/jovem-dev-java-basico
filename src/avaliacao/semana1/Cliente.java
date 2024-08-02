package avaliacao.semana1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Cliente {

	String nome;
	LocalDate dataNascimento;

	public Cliente(String nome) {
		this.nome = nome;
	}

	public void setDataNascimento(String dataNascimento) throws DateTimeParseException {
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public boolean terceiraIdade() {
		return (this.dataNascimento.until(LocalDate.now(), ChronoUnit.YEARS) > 60);
	}

	public boolean aniversario() {
		if(this.dataNascimento.getMonthValue() == LocalDate.now().getMonthValue())
			return(this.dataNascimento.getDayOfMonth() == LocalDate.now().getDayOfMonth());
		return false;
	}

	public boolean premium() {
		return false;
	}

	public String nomeAnonimo() {
		String msg = this.nome.substring(0, 1);
		for (int i = 1; i < this.nome.length(); i++) {
			if (this.nome.charAt(i) == ' ')
				msg += " ";
			else
				msg += "*";
		}
		return msg;
	}
}
