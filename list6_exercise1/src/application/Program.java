package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe quantos funcionários trabalham na empresa:");
		int qtd = sc.nextInt();

		Funcionario[] vectFuncionario = new Funcionario[qtd];

		while (true) {
			System.out.println("");
			System.out.println("================= MENU =================");
			System.out.println("|1. Cadastrar um funcionário           |");
			System.out.println("2. Exibir os funcionários de alta renda|");
			System.out.println("|0. sair                               |");
			System.out.println("========================================");
			System.out.println();

			System.out.println("Digite a sua opção:");
			int opcao = sc.nextInt();

			switch (opcao) {
			case 1: {
				for (int i = 0; i < qtd; i++) {
					sc.nextLine();
					System.out.println("Digite o nome do " + (i + 1) + "º funcionário:");
					String nome = sc.nextLine();
					System.out.println("Digite o salário do " + (i + 1) + "º funcionário:");
					double salario = sc.nextDouble();
					vectFuncionario[i] = new Funcionario(nome, salario);
				}
				break;
			}
			case 2: {
				System.out.println("Funcionários de alta renda: ");
				for (int i = 0; i < vectFuncionario.length; i++) {
					if (vectFuncionario[i].getSalario() > 5000) {
						System.out.print(vectFuncionario[i].getNome());
						System.out.printf(" recebendo R$ %.2f%n", vectFuncionario[i].getSalario());
					}
				}
				break;
			}
			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}
			default: {
				System.out.println("Opção inválida! Por favor escolha uma opção válida (1, 2, 0)");
				break;
			}
			}

		}

	}

}