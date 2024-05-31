package entities;

public class ContaEspecial extends ContaBancaria {

	private double limite;
	
	public ContaEspecial() {
		super();
	}
	
	public ContaEspecial(String nome, String numConta, double saldo, double limite) {
		super(nome, numConta, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void sacar(double quantia) {
		if (quantia <= getSaldo() + limite) {
			super.saldo = getSaldo() - quantia;
			System.out.println("Saque realizado com sucesso!");
			System.out.printf("Novo saldo: R$ %.2f ", getSaldo());
			System.out.println();
		}
		else {
			System.out.println("O seu limite é de: R$ " + limite);
			System.out.println("A quantia deve ser menor que o limite!");
		}
		
	}
	
}