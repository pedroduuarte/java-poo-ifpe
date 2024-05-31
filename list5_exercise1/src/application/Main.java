package application;

import java.util.Scanner;

import entities.Estudante;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Estudante estudante = new Estudante();
		
		while (true) {
			System.out.println("\n=== MENU ===");
			System.out.println("1. Criar estudante.");
			System.out.println("2. Calcular Média.");
			System.out.println("3. Obter número de matrícula.");
			System.out.println("4. Obter endereço.");
			System.out.println("0. Sair");
			
			System.out.println("Digite o nº da sua opção:");
			int opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
			case 1:{
				estudante = estudante.criarEstudante();
				break;
			}
			case 2: {
				if (estudante != null) {
					double media = estudante.calcularMedia();
					System.out.print("A média de " + estudante.getNome() + " foi de: ");
					System.out.printf("%.2f pontos", media);
					System.out.println(" ");
					System.out.println(estudante.verificarAprovacao());
					
				}
				else System.out.println("O estudante ainda não foi criado!");
				break;
			}
			case 3: { 
				if (estudante != null) {
					System.out.println("Matrícula de " + estudante.getNome() + ": " + estudante.getMatricula());
				}
				else System.out.println("O estudante ainda não foi criado!");
				break;
			}
			case 4: {
				if (estudante != null) {
					System.out.println("Endereço de " + estudante.getNome() + ": " + estudante.getEndereco());
				}
				else System.out.println("O estudante ainda não foi criado!");
				break;
				}
			case 0: 
				System.out.println("Programa encerrado!");
				System.exit(0);
				break;
			}	
		}
		
	}
}