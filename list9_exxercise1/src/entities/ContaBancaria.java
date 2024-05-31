package entities;

public class ContaBancaria {

	private String nome;
	private String numConta;
	protected double saldo;
	
	public ContaBancaria() {	
	}
	
	public ContaBancaria(String nome, String numConta, double saldo) {
		this.nome = nome;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNumConta() {
		return numConta;
	}
	
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double quantia) {
		if (quantia <= saldo) {
			double novoSaldo = saldo - quantia;
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Novo saldo: R$ %.2f%n ", novoSaldo);
			System.out.println();
		}
		
		else {
			System.out.println("Saldo insuficiente!\n");
		}
	}
	
	public void depositar(double quantia) {
		System.out.println("Depósito realizado com sucesso!");
		System.out.printf("Novo saldo: R$ %.2f%n", saldo+quantia);
	}
	
	public String toString() {
		return "\nTitular da conta: " + nome + 
				"\nNº da conta: " + numConta +
				"\nSaldo atual: R$ " + String.format("%.2f", saldo) + "\n";
	}
}