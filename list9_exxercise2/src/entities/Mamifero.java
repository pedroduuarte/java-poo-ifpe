package entities;

public class Mamifero extends Animal {

	private String alimentoPreferido;
	
	public Mamifero() {
		super();
	}
	
	public Mamifero(String nome, double comprimento, int numeroPatas,
			String cor, String ambiente, double velocidade, String alimentoPreferido) {
		super(nome, comprimento, numeroPatas, cor, ambiente, velocidade);
		this.alimentoPreferido = alimentoPreferido;
	}
	
	public String getAlimentoPreferido() {
		return alimentoPreferido;
	}
	
	public void setAlimentoPreferido(String alimentoPreferido) {
		this.alimentoPreferido = alimentoPreferido;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAlimento preferido: " +
				alimentoPreferido + "\n";
	}
	
}
