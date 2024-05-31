package entities;

public class Peixe extends Animal {

	private int numeroBarbatanas;
	private double comprimentoCauda;
	
	public Peixe() {
		super();
	}
	
	public Peixe(String nome, double comprimento, int numeroPatas, 
			String cor, String ambiente, double velocidade, 
			int numeroBarbatanas, double  comprimentoCauda) {
		super(nome, comprimento, numeroPatas,cor, ambiente,  velocidade);
		this.numeroBarbatanas = numeroBarbatanas;
		this.comprimentoCauda = comprimentoCauda;
	}
	
	public int getNumeroBarbatanas() {
		return numeroBarbatanas;
	}
	
	public void setNumeroBarbatanas(int numeroBarbatanas) {
		this.numeroBarbatanas = numeroBarbatanas;
	} 
	
	public double getComprimentoCauda() {
		return comprimentoCauda;
	}
	
	public void setComprimentoCauda(double comprimentoCauda) {
		this.comprimentoCauda = comprimentoCauda;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				" Nº de barbatanas: " + numeroBarbatanas + 
				"\n Comprimento da cauda: " + String.format("%.2f", comprimentoCauda) + 
				" centímetros\n";
	}
}