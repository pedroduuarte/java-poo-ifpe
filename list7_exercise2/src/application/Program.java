package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Product prod;

		List<Product> produtos = new ArrayList<>();

		while (true) {
			System.out.println("==============MENU==============");
			System.out.println("| 1. Cadastrar produto         |");
			System.out.println("| 2. Buscar produto.           |");
			System.out.println("| 3. Listar todos os produtos. |");
			System.out.println("| 4. Efetuar venda de produto. |");
			System.out.println("| 0. Sair.                     |");
			System.out.println("================================");

			System.out.print("Digite a sua opção (0, 1, 2, 3, 4): ");
			int opcao = sc.nextInt();

			sc.nextLine();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o nome do produto: ");
				String nome = sc.nextLine();
				System.out.print("Digite o código do produto: ");
				String cod = sc.nextLine();
				System.out.print("Digite o preço do produto: ");
				double preco = sc.nextDouble();
				System.out.print("Digite a quantidade da nota: ");
				int quantidade = sc.nextInt();

				prod = new Product(nome, cod, preco, quantidade);
				produtos.add(prod);

				break;
			}

			case 2: {
				System.out.println();
				System.out.print("Digite o nome do produto: ");
				String nomeProcurado = sc.nextLine();

				for (Product p : produtos) {
					if (p.getNome().equals(nomeProcurado)) {
						System.out.println(p);
					}
				}

				break;
			}

			case 3: {
				System.out.println();
				System.out.println("LISTA DE TODOS OS PRODUTOS:");
				for (Product p : produtos) {
					System.out.println(p);
				}

				break;
			}

			case 4: {
				System.out.print("Digite a quantidade de produtos: ");
				int quantidadeVenda = sc.nextInt();
				sc.nextLine();

				double sum = 0.0;
				
				for (int i = 0; i < quantidadeVenda; i++) {
					System.out.print("Digite o nome do produto #" + (i + 1) + ": ");
					String nomeVenda = sc.nextLine();
					System.out.println("Digite a quantidade do produto #" + (i + 1) + " a serem vendidos:");
					int quantidadeProd = sc.nextInt();
					sc.nextLine();

					boolean produtoEncontrado = false;

					for (Product p : produtos) {
						if (p.getNome().equals(nomeVenda)) {
							if (p.getQuantidade() >= quantidadeProd) {
								p.setQuantidade(p.getQuantidade() - quantidadeProd);
								double precoProd = p.getPreco();
								sum +=  precoProd * quantidadeProd;
								produtoEncontrado = true;
								break;
							}
							else {
								System.out.println("Não há estoque o suficiente para o produto " + nomeVenda);
							}
							 break;
						}
						
					}
					
					if (!produtoEncontrado) {
						System.out.println("Produto não encontrado!");
					}

					System.out.printf("Valor Total da Venda: R$ %.2f%n", sum);
					System.out.println("Muito Obrigado! Volte sempre!");
					System.out.println();

				}

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
}