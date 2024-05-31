package entities;

import java.util.Scanner;

public class Car {

    private String modelo;
    private String cor;
    private double eficiencia;
    private double combustivel;

    public Car(String modelo, String cor, double eficiencia, double combustivel) {
        this.modelo = modelo;
        this.cor = cor;
        this.eficiencia = eficiencia;
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public void andar(Scanner sc) {
        System.out.println("Informe quantos km você vai percorrer nessa corrida: ");
        double km = sc.nextDouble();

        double autonomia = getCombustivel() * getEficiencia();

        if (km <= autonomia) {
            double combustivelUsado = km / getEficiencia();
            this.setCombustivel(this.getCombustivel() - combustivelUsado);

            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("COMBUSTÍVEL NO CARRO: " + String.format("%.2f", getCombustivel()) + "L");
            System.out.println("\nA VIAGEM SERÁ DE " + km + " KM");
            System.out.println("\nAUTONOMIA RESTANTE NO CARRO: " + (getCombustivel() * getEficiencia()) + " KM");
            System.out.println("\nO carro está andando...");
            System.out.println("-------------------------------");
        } else {
            System.out.println();
            System.out.println("-------------------------------");
            System.out.println("COMBUSTÍVEL NO CARRO: " + getCombustivel() + "L");
            System.out.println("\nA VIAGEM SERÁ DE " + km + " KM");
            System.out.println("\nAUTONOMIA RESTANTE NO CARRO: " + autonomia + " KM");
            System.out.println("\nVOCÊ PRECISA ABASTECER!!");
            System.out.println("-------------------------------");
        }
    }

    public void reabastecer(Scanner sc) {
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("| (1) GASOLINA COMUM ====== R$ 5,50");
        System.out.println("| (2) GASOLINA ADITIVADA == R$ 5,70");
        System.out.println("| (3) ETANOL ============== R$ 3,10");
        System.out.println("| (4) ===== IR PARA PAGAMENTO =====");
        System.out.println("-----------------------------------");

        System.out.println();
        System.out.print("Digite a sua opção de combustível: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        System.out.println("\nQuantos litros você irá abastecer?");
        double litragem = sc.nextDouble();
        sc.nextLine();

        this.setCombustivel(getCombustivel() + litragem);

        switch (opcao) {
            case 1:
                System.out.println();
                System.out.println("\nTOTAL A PAGAR: R$ " + (litragem * 5.50));
                break;
            case 2:
                System.out.println();
                System.out.println("\nTOTAL A PAGAR: R$ " + (litragem * 5.70));
                break;
            case 3:
                System.out.println();
                System.out.println("\nTOTAL A PAGAR: R$ " + (litragem * 3.10));
                break;
            case 4:
                System.out.println("Muito obrigado! Volte sempre!");
                System.exit(4);
                break;
            default:
                System.out.println("Você digitou uma opção inválida!");
                break;
        }
    }

    public void verificarCombustivel() {
        double combustivelAtual = getCombustivel();
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("O carro tem " + combustivelAtual + " litros de combustível!");
        System.out.println("-----------------------------------");
    }
}