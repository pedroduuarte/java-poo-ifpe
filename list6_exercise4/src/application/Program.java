package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario;
		List<Funcionario> funcionarios = new ArrayList<>();

		while (true) {
			System.out.println();
			System.out.println("========== MENU ==========");
			System.out.println("|1. Cadastrar funcionário.|");
			System.out.println("|2. Calcular imposto.     |");
			System.out.println("|0. Sair.                 |");
			System.out.println("===========================");

			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();
			System.out.println();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome do funcionário: ");
				String nome = sc.nextLine();
				System.out.print("Digite o salário de " + nome + ": R$  ");
				double salario = sc.nextDouble();

				funcionario = new Funcionario(nome, salario);
				funcionarios.add(funcionario);

				System.out.println("Funcionário cadastrado com sucesso!");
				break;
			}
			case 2: {
				System.out.println("Digite o nome do funcionário que você deseja calcular o imposto:");
				String funcionarioProcurado = sc.nextLine();
				for (Funcionario x : funcionarios) {
					if (x.getNome().equals(funcionarioProcurado)) {
						calcIR(x);
					}
					
					else System.out.println("Funcionário não encontrado!");
				}
				break;
			}

			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}

			default:
				System.out.println("Opção inválida! Tente novamente...");
			}
		}
	}
	
	public static void calcIR(Funcionario funcionario) {
		double novoSalario;
		if (funcionario.getSalario() <= 2000.00) {
			System.out.println("Isento de imposto.");
		}
		else if (funcionario.getSalario() > 2000.00 && funcionario.getSalario() <= 3500.00) {
			novoSalario = funcionario.getSalario() - ((funcionario.getSalario() * 15)/100);
			System.out.printf("15%% de imposto\nSALÁRIO DESCONTADO O IMPOSTO : R$ %.2f%n", novoSalario);
		}
		else if (funcionario.getSalario() > 3500.00 && funcionario.getSalario() <= 5000.00) {
			novoSalario = funcionario.getSalario() - ((funcionario.getSalario() * 22)/100);
			System.out.printf("22%% de imposto\nSALÁRIO DESCONTADO O IMPOSTO : R$ %.2f%n", novoSalario);
		}
		else {
			novoSalario = funcionario.getSalario() - ((funcionario.getSalario() * 30)/100);
			System.out.printf("30%% de imposto\nSALÁRIO DESCONTADO O IMPOSTO : R$ %.2f%n", novoSalario);
		}
	}

}