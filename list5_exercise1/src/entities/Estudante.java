package entities;

import java.util.Scanner;

public class Estudante {

	private String nome; 
	private String matricula;
	private String endereco;
	private double[] notas;
	
	public Estudante(String nome, String matricula, String endereco, double[] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.endereco = endereco;
		this.notas = notas;
	}
	public Estudante() {
		
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

	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public Estudante criarEstudante() {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome do estudante: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite a matrícula de " + nome + ":");
		String matricula = sc.nextLine();
		
		System.out.println("Digite o endereço do estudante: ");
		String endereco = sc.nextLine();
		
		double notas[] = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("Digite a nota " + (i+1) + " de " + nome + ":");
			notas[i] = sc.nextDouble();
		}
		this.notas = notas;
		
		System.out.println("Estudante criado com sucesso!");
		return new Estudante(nome, matricula, endereco, notas);
	
	}
	
	public double calcularMedia() {
		double soma = 0;
		for(int i = 0; i < 4; i++) {
			soma += this.notas[i];
		}
		
		double media = soma / 4;
		return media;
	}
	
	public String verificarAprovacao() {
		double media = calcularMedia();
		
		if (media >=7) {
			return "Estudante aprovado!";	
		}
		else return "Estudanteo não aprovado!";
	}
	
}
