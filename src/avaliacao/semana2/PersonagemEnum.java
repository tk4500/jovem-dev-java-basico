package avaliacao.semana2;

public enum PersonagemEnum {
	MAGO(30, 18, 23, "Mago"), BARBARO(100, 20, 18, "Bárbaro"), PALADINO(50, 20, 19, "Paladino"),
	MORCEGO(10, 5, 5, "Morcego"), ZUMBI(22, 6, 6, "Zumbi"), URSO(30, 8, 9, "Urso"), VAMPIRO(35, 10, 10, "Vampiro"),
	AROK(50, 20, 20, "Arok, Mestre Supremo"), TEST(999, 999, 999, "test character");

	private int maxHP;
	private int ataque;
	private int defesa;
	private String nome;

	private PersonagemEnum(int vidaBase, int ataque, int defesa, String nome) {
		this.maxHP = vidaBase;
		this.ataque = ataque;
		this.defesa = defesa;
		this.nome = nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public int getMaxHP() {
		return maxHP;
	}

	public String getNome() {
		return nome;
	}

}
