package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Account;
import entities.Client;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Client client;
		Account account;

		List<Account> accounts = new ArrayList<>();
		List<Client> clients = new ArrayList<>();

		while (true) {
			System.out.println("===========MENU===========");
			System.out.println("| 1. Cadastrar Conta.    |");
			System.out.println("| 2. Realizar depósito.  |");
			System.out.println("| 3. Realizar saque.     |");
			System.out.println("| 4. Verificar saldo.    |");
			System.out.println("| 5. Consultar cliente.  |");
			System.out.println("| 0. Sair.               |");
			System.out.println("==========================");

			System.out.println();
			System.out.print("Digite a sua opção: ");
			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1: {
				System.out.print("Digite o número da conta: ");
				String num = sc.nextLine();
				System.out.print("Digite o nome do cliente: ");
				String name = sc.nextLine();
				System.out.print("Digite o cpf de " + name + ": ");
				String cpf = sc.nextLine();

				double initialDeposit;

				System.out.print("Terá um depósito inicial? (s/n): ");
				String optionDeposit = sc.nextLine();

				if (optionDeposit.equals("s")) {
					System.out.print("Digite o valor do deposito inicial: ");
					initialDeposit = sc.nextDouble();
				} else {
					initialDeposit = 0.0;
				}

				client = new Client(name, cpf);
				account = new Account(num, client, initialDeposit);

				clients.add(client);
				accounts.add(account);

				System.out.println("CONTA CADASTRADA COM SUCESSO!!");
				break;

			}

			case 2: {
				System.out.println();
				System.out.print("Digite o nome do cliente: ");
				String foundName = sc.nextLine();

				boolean searchAccount = false;

				for (Account acc : accounts) {
					if (acc.getClient().getClientName().equals(foundName)) {
						System.out.print("Digite o valor do depósito: ");
						double depositValue = sc.nextDouble();
						acc.deposit(depositValue);
						System.out.println("Depósito realizado com sucesso!");
						System.out.println("Novo saldo: R$ " + acc.getBalance());
						searchAccount = true;

						break;
					}
				}
				
				if (!searchAccount) {
					System.out.println("Conta não encontrada!");
				}

				break;
			}

			case 3: {
				System.out.println();
				System.out.print("Digite o nome do cliente: ");
				String foundName = sc.nextLine();

				boolean searchAccount = false;

				for (Account acc : accounts) {
					if (acc.getClient().getClientName().equals(foundName)) {
						System.out.print("Digite o valor do saque: ");
						double withdrawValue = sc.nextDouble();
						if (withdrawValue <= acc.getBalance()) {
							acc.withdraw(withdrawValue);
							System.out.println("Saque realizado com sucesso!");
							System.out.println("Novo saldo: R$ " + acc.getBalance());
						}
						else {
							System.out.println("Saldo insuficiente!");
						}
						searchAccount = true;

						break;
					}
				}
				
				if (!searchAccount) {
					System.out.println("Conta não encontrada!");
				}

				break;

			}

			case 4: {
				System.out.println();
				System.out.print("Digite o nome do cliente: ");
				String foundName = sc.nextLine();

				boolean searchAccount = false;

				for (Account acc : accounts) {
					if (acc.getClient().getClientName().equals(foundName)) {
						System.out.println("Saldo atual de " + foundName + ": R$ " + acc.getBalance());
						searchAccount = true;

						break;
					}
				}
				
				if (!searchAccount) {
					System.out.println("Conta não encontrada!");
					}
				

				break;
			}

			case 5: {
				System.out.println();
				System.out.print("Digite o nome do cliente: ");
				String foundName = sc.nextLine();

				boolean searchClient = false;

				for (Client c : clients) {
					if (c.getClientName().equals(foundName)) {
						System.out.println(c);

						searchClient = true;

						break;
					}
				}
				if (!searchClient) {
					System.out.println("Cliente não encontrado!");
				}
				
				break;
			}

			case 0: {
				System.out.println("PROGRAMA ENCERRADO!");
				System.exit(0);
			}

			default: {
				System.out.println("Opção inválida! Tente novamente!");
			}

			}

		}
	}
}