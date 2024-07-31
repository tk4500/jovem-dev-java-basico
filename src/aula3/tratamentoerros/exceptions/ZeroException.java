package aula3.tratamentoerros.exceptions;

public class ZeroException extends IllegalArgumentException {

	private static final long serialVersionUID = -197772452115144247L;

	public ZeroException() {
		super("O Segundo número não pode ser 0");
	}

	public ZeroException(String s) {
		super(s);
	}
}
