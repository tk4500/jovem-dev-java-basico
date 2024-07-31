package aula3.tratamentoerros.exceptions;

public class VendaException extends Exception{
	public VendaException() {
		super("Quantia de Itens fora do valor permitido");
	}

	public VendaException(String s) {
		super(s);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7434760538560521979L;
}
