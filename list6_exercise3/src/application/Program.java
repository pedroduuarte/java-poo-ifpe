package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Paciente;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Paciente paciente;
		List<Paciente> pacientes = new ArrayList<>();

		while (true) {
			System.out.println();
			System.out.println("======================== MENU ========================");
			System.out.println("|1. Cadastrar um paciente.                            |");
			System.out.println("|2. Mostrar os pacientes que  abaixo do peso.         |");
			System.out.println("|3. Mostrar as pessoas que estão dentro do peso ideal.|");
			System.out.println("|4. Mostrar as pessoas que estão acima do peso.       |");
			System.out.println("|0. Sair.                                             |");
			System.out.println("=======================================================");
			System.out.println();
			
			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome do paciente: ");
				String nome = sc.nextLine();
				System.out.print("Digite o peso de " + nome + ": ");
				double peso = sc.nextDouble();
				System.out.print("Digite a altura de " + nome + ": ");
				double altura = sc.nextDouble();

				paciente = new Paciente(nome, peso, altura);
				pacientes.add(paciente);

				System.out.println("Paciente cadastrado com sucesso!");
				System.out.println();
				
				break;
			}

			case 2: {
				System.out.println("Pacientes abaixo do peso:");
				for (Paciente x : pacientes) {
					if (x.calcImc() < 18.5) {
						System.out.println(x.getNome());
					}
				}
				break;
			}
			
			case 3: {
				System.out.println("Pacientes com o peso ideal:");
				System.out.println();
				for (Paciente x : pacientes) {
					if (x.calcImc() > 18.5 && x.calcImc() < 25) {
						System.out.println(x.getNome());
					}
				}
				break;
			}
			
			case 4: {
				System.out.println("Pacientes acima do peso:");
				for (Paciente x : pacientes) {
					if (x.calcImc() >= 25) {
						System.out.println(x.getNome());
					}
				}
				break;
			}
			
			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			
			default: {
				System.out.println("Opção Inválida! Tente novamente: ");
			}

			}
		}

	}

}