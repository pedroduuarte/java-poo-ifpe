package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Animal;
import entities.Mamifero;
import entities.Peixe;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Animal> lista = new ArrayList<>();

		while (true) {
			System.out.println("=====================MENU=====================");
			System.out.println("| 1. Incluir dados relativos a um peixe.      |");
			System.out.println("| 2. Incluir dados relativos a um mamífero.   |");
			System.out.println("| 3. Listar todos os animais cadastrados.     |");
			System.out.println("| 4. Listar todos os peixes cadastrados.      |");
			System.out.println("| 0. Sair.                                    |");
			System.out.println("===============================================");
			System.out.println();
			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();
			
			sc.nextLine();

			switch (opcao) {
			case 1: {
				
				System.out.println();

				System.out.print("Digite o nome do peixe: ");
				String nome = sc.nextLine();
				System.out.print("Digite o comprimento do peixe (em m): ");
				double comprimento = sc.nextDouble();
				System.out.print("Digite a velocidade do peixe (m/s): ");
				double velocidade = sc.nextDouble();
				System.out.print("Digite o nº de barbatanas do peixe: ");
				int numeroBarbatanas = sc.nextInt();
				System.out.print("Digite o comprimento da cauda do peixe (em cm): ");
				double comprimentoCauda = sc.nextDouble();
				sc.nextLine();
				
				System.out.print("O peixe é acinzentado padrão (s/n))? ");
				String opcaoCor = sc.nextLine();
				
				if (opcaoCor.equals("s")) {
					lista.add( new Peixe(nome, comprimento, 0, 
							"Cinzenta", "Mar", velocidade, numeroBarbatanas, comprimentoCauda));
				}
				
				else {
					System.out.print("Digite a cor do peixe: ");
					String cor = sc.nextLine();
					lista.add( new Peixe(nome, comprimento, 0, 
							cor, "Mar", velocidade, numeroBarbatanas, comprimentoCauda));
					
				}
				
				System.out.println();
				System.out.println("PEIXE CADASTRADO COM SUCESSO!");
				System.out.println();
				
				break;
			
			}
			
			case 2: {
				System.out.println();
				System.out.print("Digite o nome do mamífero: ");
				String nome = sc.nextLine();
				System.out.print("Digite o comprimento do mamífero (em m): ");
				double comprimento = sc.nextDouble();
				System.out.print("Digite o número de patas do mamífero: ");
				int numeroPatas = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite a cor do mamífero: ");
				String cor = sc.nextLine();
				System.out.print("Digite a velocidade do mamífero (m/s): ");
				double velocidade = sc.nextDouble();
				sc.nextLine();
				System.out.print("Digite o alimento preferido do mamífero: ");
				String alimentoPreferido = sc.nextLine();
				
				lista.add(new Mamifero(nome, comprimento, numeroPatas, cor, 
						"terra", velocidade, alimentoPreferido));
				
				System.out.println();
				System.out.println("MAMÍFERO CADASTRADO COM SUCESSO!");
				System.out.println();
				
				break;
				
			}
			
			case 3: {
				for (Animal animal : lista) {
				System.out.println(animal);
				}
				
				break;
				
			}
			case 4: {
				for (Animal animal : lista) {
					if (animal instanceof Peixe) {
						System.out.println(animal);
					}
			}
				
				break;
				
			}
			
			case 0: {
				System.out.println("PROGRAMA ENCERRADO");
				System.exit(0);
				
			}
			
			default: {
				System.out.println("Opção inválida! Por favor tente novamente!");
			}
			}

		}

	}
}