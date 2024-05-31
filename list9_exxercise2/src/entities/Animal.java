package entities;

public class Animal {

	private String nome;
	private double comprimento;
	private int numeroPatas;
	private String cor;
	private String ambiente;
	private double velocidade;
	
	public Animal() {
	}
	
	public Animal(String nome, double comprimento, int numeroPatas,
			String cor, String ambiente, double velocidade) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroPatas = numeroPatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public int getNumeroPatas() {
		return numeroPatas;
	} 
	
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public String toString() {
		return "Nome: " + nome + 
				"\n Comprimento: " + comprimento + " metros" +
				"\n Nº de patas: " + numeroPatas + 
				"\n Cor: " + cor + 
				"\n Ambiente: " + ambiente +
				"\n Velocidade: " + String.format("%.2f", velocidade) + "m/s\n";
	}
	
}