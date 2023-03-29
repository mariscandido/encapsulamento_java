package util;

public class Cadastro {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;

	public Cadastro() {
		super();
	}

	public Cadastro(int numeroConta, String nomeTitular, double valorInicial) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = valorInicial;
	}

	public Cadastro(int numeroConta, String nomeTitular) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public void Deposito(double valor) {
		saldo += valor;
	}

	public void Saque(double valor) {
		saldo -= (valor + 5.00);
	}

	public String toString() {
		return "Conta " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: $ " + String.format("%.2f", saldo);
	}
}
