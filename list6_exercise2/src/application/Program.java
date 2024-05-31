package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante estudante;
		List<Estudante> estudantes = new ArrayList<>();

		while (true) {
			System.out.println();
			System.out.println("============== MENU ==============");
			System.out.println("|1. Cadastrar estudante.          |");
			System.out.println("|2. Obter o nome do estudante.    |");
			System.out.println("|3. Calcular a média do estudante.|");
			System.out.println("|0. Sair.                         |");
			System.out.println("===================================");
			System.out.println();

			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome do estudante: ");
				String nome = sc.nextLine();
				System.out.print("Digite o nº da matrícula do estudante: ");
				String matricula = sc.nextLine();

				double[] notas = new double[2];
				for (int i = 0; i < 2; i++) {
					System.out.print("Digite a nota " + (i + 1) + " de " + nome + ": ");
					notas[i] = sc.nextDouble();
				}

				estudante = new Estudante(matricula, nome, notas);
				estudantes.add(estudante);

				break;
			}

			case 2: {
				System.out.println();
				System.out.println("-------------------");
				System.out.print("Digite o número da matrícula do estudante: ");
				String findMatricula = sc.nextLine();

				System.out.println("Estudante: " + findEstudante(estudantes, findMatricula).getNome());
				System.out.println("-------------------");
				break;
			}

			case 3: {
				System.out.println("-------------------");
				System.out.print("Digite a matrícula estudante você deseja calcular a matrícula: ");
				String findMatricula = sc.nextLine();
				estudante = findEstudante(estudantes, findMatricula);

				if (estudante != null) {
					double media = estudante.calcularMedia();

					System.out.println("Média de " + estudante.getNome() + ": " + media);
					System.out.println("-------------------");
				}

				else
					System.out.println("Estudante não encontrado!");
				System.out.println("-------------------");
				break;
			}

			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}

			default: {
				System.out.println("Opção inválida!");
			}
			}
		}
	}

	public static Estudante findEstudante(List<Estudante> estudantes, String matricula) {
		for (Estudante estudante : estudantes) {
			if (estudante.getMatricula().equals(matricula)) {
				return estudante;
			}
		}
		return null;

	}

}