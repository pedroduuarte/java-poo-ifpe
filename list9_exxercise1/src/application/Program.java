package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ContaBancaria;
import entities.ContaEspecial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<ContaBancaria> contas = new ArrayList<>();

		while (true) {
			System.out.println("=========================MENU=========================");
			System.out.println("|1. Incluir dados relativos a conta de um cliente.    | ");
			System.out.println("|2. Sacar um determinado valor de uma conta.          | ");
			System.out.println("|3. Depositar um determinado valor na sua conta.      | ");
			System.out.println("|4. Mostrar o novo saldo do cliente (CONTA POUPANÇA). | ");
			System.out.println("|5. Mostrar os dados de todas as contas cadastradas.  | ");
			System.out.println("|0. Sair.                                             | ");
			System.out.println("=======================================================");

			System.out.println();
			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();

			sc.nextLine();

			switch (opcao) {
			case 1: {
				incluirContas(contas);
				break;
			}

			case 2: {
				sacarDinheiro(contas);
				break;
			}

			case 3: {
				doepositarDinheiro(contas);
				break;
			}

			case 4: {
				System.out.print("Digite o número da conta: ");
				String contaProcurada = sc.nextLine();
				
				boolean procurarConta = false;
				for (ContaBancaria c : contas) {
					if (c instanceof ContaPoupanca && c.getNumConta().equals(contaProcurada)) {
						ContaPoupanca contapoup = (ContaPoupanca) c;
						System.out.print("Digite a taxa de rendimento da conta: ");
						double taxaRendimento = sc.nextDouble();
						contapoup.calcularNovoSaldo(taxaRendimento);
						procurarConta = true;
						break;
					}
				}
				if (!procurarConta) {
					System.out.println("ERRO: Conta não encontrada ou ca conta não é poupança!");
				}
				break;
			}

			case 5: {
				for (ContaBancaria c : contas) {
					System.out.println(c);
				}
				break;
			}

			case 0: {
				System.out.println("PROGRAMA ENCERRADO!");
				System.exit(0);
			}

			default:
				System.out.println("Você digitou uma opção inválida!");

			}

		}

	}

	public static void incluirContas(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);

		if (contas.size() < 5) {
			System.out.print("Digite o nome do cliente: ");
			String nome = sc.nextLine();
			System.out.print("Digite o número da conta: ");
			String numConta = sc.nextLine();
			System.out.print("Terá um depósito inicial (s/n)? ");
			char opcaoDeposito = sc.next().charAt(0);

			double saldo = 0.0;
			while (true) {
				if (opcaoDeposito == 's') {
					System.out.print("Digite o valor do deósito inicial: ");
					saldo = sc.nextDouble();
					break;
				}

				else if (opcaoDeposito == 'n') {
					saldo = 0.0;
					break;
				}

				else {
					System.out.println("Você digitou uma opçao inválida!");
					break;
				}
			}
			System.out.println();
			System.out.println("DIGITE O TIPO DA CONTA:");
			System.out.println("| 1. Conta bancária |");
			System.out.println("| 2. Conta poupança |");
			System.out.println("| 3. Conta especial |");
			System.out.println("=====================");
			int tipoConta = sc.nextInt();
			sc.nextLine();

			switch (tipoConta) {
			case 1: {
				contas.add(new ContaBancaria(nome, numConta, saldo));
				System.out.println("CONTA CRIADA COM SUCESSO!");
				break;
			}

			case 2: {
				System.out.print("Digite o dia de rendimento: ");
				int diaDeRendimento = sc.nextInt();
				contas.add(new ContaPoupanca(nome, numConta, saldo, diaDeRendimento));
				System.out.println("CONTA CRIADA COM SUCESSO!");
				break;
			}

			case 3: {
				System.out.print("Digite o valor do limite da conta: ");
				double limite = sc.nextDouble();
				contas.add(new ContaEspecial(nome, numConta, saldo, limite));
				System.out.println("CONTA CRIADA COM SUCESSO!");
				break;
			}
			default: {
				System.out.println("Opção inválida!");
			}
			}

		} else {
			System.out.println("Limite de contas atingido!");
		}
	}

	public static void sacarDinheiro(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número da conta: ");
		String contaProcurada = sc.nextLine();
		
		boolean procurarConta = false;
		
		for (ContaBancaria c : contas) {
			if (c.getNumConta().equals(contaProcurada)) {
				System.out.print("Digite o valor a ser sacado: ");
				double valor = sc.nextDouble();
				c.sacar(valor);
				procurarConta = true;
				break;
			}
		}
		if (!procurarConta) {
			System.out.println("Conta não encontrada!");
		}
	}

	public static void doepositarDinheiro(List<ContaBancaria> contas) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número da conta: ");
		String contaProcurada = sc.nextLine();
		
		boolean procurarConta = false;

		for (ContaBancaria c : contas) {
			if (c.getNumConta().equals(contaProcurada)) {
				System.out.print("Digite o valor a ser depositado: ");
				double valor = sc.nextDouble();
				c.depositar(valor);
				procurarConta = true;
				break;
			}
		}
		if (!procurarConta) {
			System.out.println("Conta não encontrada!");
		}
	}

}