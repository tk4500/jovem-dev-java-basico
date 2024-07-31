package aula3.tratamentoerros.exceptions;

public class PrecoIncorretoException extends RuntimeException {

	public PrecoIncorretoException(String s) {
		super(s);
	}

	public PrecoIncorretoException() {
		super("Preço Incorreto");
	}

	private static final long serialVersionUID = -3271629157460630267L;

}
