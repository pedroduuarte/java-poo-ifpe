package entities;

public class Client {

	private String clientName;
	private String cpf;
	
	public Client() {
	}
	
	public Client(String clientName, String cpf) {
		this.clientName = clientName;
		this.cpf = cpf;
	}
	
	public String getClientName() {
		return clientName;
	}
	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "Nome: " + clientName + "\n" 
				+ "CPF: " + cpf;
	}
}