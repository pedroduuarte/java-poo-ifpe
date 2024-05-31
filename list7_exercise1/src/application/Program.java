package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Livro> livros = new ArrayList<>();
		Livro livro;

		while (true) {
			System.out.println("=============MENU=============");
			System.out.println("| 1. Cadastrar livro         |");
			System.out.println("| 2. Buscar livro por título |");
			System.out.println("| 3. Listar livros por autor.|");
			System.out.println("| 4. Listar todos os livros. |");
			System.out.println("| 0. Sair                    |");
			System.out.println("==============================");

			System.out.print("Digite a sua opção: ");
			int opcao = sc.nextInt();

			sc.nextLine();

			System.out.println();

			switch (opcao) {
			case 1: {
				System.out.print("Digite o autor do livro: ");
				String autor = sc.nextLine();
				System.out.print("Digite a editora do livro: ");
				String editora = sc.nextLine();
				System.out.print("Digite a IBSN do livro: ");
				String ibsn = sc.nextLine();
				System.out.print("Digite o título do livro: ");
				String titulo = sc.nextLine();
				System.out.print("Digite o ano de edição: ");
				int ano = sc.nextInt();

				livro = new Livro(autor, editora, ibsn, titulo, ano);

				livros.add(livro);

				System.out.println();

				break;
			}

			case 2: {

				System.out.println("Digite o nome do livro que você deseja procurar:");
				String l = sc.nextLine();

				for (Livro liv : livros) {
					if (liv.getTitulo().equals(l)) {
						System.out.println(liv.toString());
					}
				}
				System.out.println();
				break;
			}

			case 3: {
				System.out.print("Digite o nome do autor: ");
				String autorProcurado = sc.nextLine();

				for (Livro liv : livros) {
					if (liv.getAutor().equals(autorProcurado)) {
						System.out.println(liv.getTitulo());
					}
				}

				System.out.println();
				break;
			}

			case 4: {
				for (Livro liv : livros) {
					System.out.println(liv.toString());
				}

				System.out.println();
				break;
			}

			case 0: {
				System.out.println("Programa encerrado!");
				System.exit(0);
			}

			default:
				System.out.println("Opção inválida, por favor digite uma opção válida!");
			}
		}
	}
}