package application;

import java.util.Scanner;

import entities.Circle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle circle = null;
		double radius = 0.0;
		
		while (true) {
			System.out.println("\n===MENU===");
			System.out.println("1. Criar círculo.");
			System.out.println("2. Calcular área do círculo.");
			System.out.println("3. Calcular perímetro do círculo.");
			System.out.println("0. Sair.");
			
			System.out.println("Digite uma opção:");
			int option = sc.nextInt();
			
			switch (option) {
			case 1: {
				System.out.println("Digite o valor do raio do círculo (em cm):");
				radius = sc.nextDouble();
				
				circle = new Circle(radius);
				
				System.out.println("Círculo criado com sucesso!");
				break;
			}	
			case 2: {
				if (circle != null) {
					System.out.printf("Área do círculo: %.2f", circle.calcArea(radius));
				}
				else System.out.println("Nenhum círculo foi criado ainda!");
				break;
			}
			case 3: {
				if (circle != null) {
					System.out.printf("Perímetro do círculo: %.2f", circle.calcPerimeter(radius));
				}
				else System.out.println("Nenhum círculo foi criado ainda!");
				break;
			}
			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			default: System.out.println("Opção inválida, por favor digite uma opção válida.");
			}
		}
		
	}

}
