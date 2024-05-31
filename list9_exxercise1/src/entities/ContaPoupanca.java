package entities;

public class ContaPoupanca extends ContaBancaria {

	private int diaDeRendimento;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(String nome, String numConta, double saldo, int diaDeRendimento) {
		super(nome, numConta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}
	
	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public void calcularNovoSaldo(double taxaDeRendimento) {
		double novoSaldo = getSaldo() * (1 +taxaDeRendimento / 100);
		super.saldo = novoSaldo;
		System.out.printf("Novo saldo: R$ %.2f\n", novoSaldo);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Dia de rendimento: " + diaDeRendimento + "\n";
	}
}