package entities;

public class Estudante {
	
	private String matricula;
	private String nome;
	private double[] notas = new double[2];
	
	public Estudante(String matricula, String nome, double[] notas) {
		this.matricula = matricula;
		this.nome = nome;
		this.notas = notas;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double[] getNotas() {
		return notas;
	}
	
	public double calcularMedia() {
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.length;
	}
}