package aula6.outros;

public class Exercicio1 {

	public static void main(String[] args) {
		new Exercicio1();
	}
	public Exercicio1() {
	
		for(DiaSemanaEnum d: DiaSemanaEnum.values()) {
			System.out.println(d.getNome() + " é fim de semana? " + d.isFimDeSemana());
		}
	}
}
