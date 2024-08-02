package avaliacao.semana1;

public class ClientePremium extends Cliente{

	public ClientePremium(String nome) {
		super(nome);
	}
	
	@Override
	public boolean premium() {
		return true;
	}
}
