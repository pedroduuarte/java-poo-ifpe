package application;

import java.util.Scanner;

import entities.Car;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car carro;

        System.out.print("Informe o modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Informe a cor do carro: ");
        String cor = sc.nextLine();
        System.out.print("Informe a eficiência do carro (km/L): ");
        double eficiencia = sc.nextDouble();
        System.out.print("Qual a quantidade de combustível disponível (L)? ");
        double combustivel = sc.nextDouble();

        carro = new Car(modelo, cor, eficiencia, combustivel);

        while (true) {
            System.out.println();
            System.out.println("======================= MENU =======================");
            System.out.println("| 1. Andar.                                         |");
            System.out.println("| 2. Reabastecer.                                   |");
            System.out.println("| 3. Verificar a quantidade de combustível restante.|");
            System.out.println("| 4. Encerrar viagem.                               |");
            System.out.println("=====================================================");

            System.out.print("Digite a sua opção: ");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    carro.andar(sc);
                    break;
                case 2:
                    carro.reabastecer(sc);
                    break;
                case 3:
                    carro.verificarCombustivel();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Viagem encerrada!");
                    System.out.println("Programa encerrado!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Você digitou uma opção inválida!");
                    break;
            }
        }
    }
}