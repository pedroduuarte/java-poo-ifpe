package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle retangulo = null;
		double base = 0;
		double height = 0;

		while (true) {
			System.out.print("\n");
			System.out.println("===MENU===");
			System.out.println("1. Criar um retângulo");
			System.out.println("2. Calcular área");
			System.out.println("3. Calcular perímetro");
			System.out.println("0. Sair");
			System.out.println("==========");
			System.out.println("Digite uma opção: ");
			int option = sc.nextInt();

			switch (option) {
			case 1: {
				System.out.println("Digite o valor da base do retângulo (em cm): ");
				base = sc.nextDouble();
				System.out.println("Digite o valor da altura do retângulo (em cm): ");
				height = sc.nextDouble();

				retangulo = new Rectangle(base, height);
				System.out.println("Retângulo criado com sucesso!");
				break;
			}
			case 2: {
				if (retangulo != null) {
					System.out.printf("A área do retângulo é: %.2f cm²", retangulo.areaRectangle(base, height));
				} else
					System.out.println("Nenhum retângulo foi criado ainda!");
				break;
			}
			case 3: {
				if (retangulo != null) {
					System.out.printf("O perímetro do retângulo é: %.2f cm", retangulo.perimeterRectangle(base, height));
				} else
					System.out.println("Nenhum retângulo foi criado ainda!");
				break;
			}
			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			default: {
				System.out.println("Opção inválida! Por favor escolha uma opção válida (1, 2, 3, 0)");
				break;
			}
			}

		}
	}

}
