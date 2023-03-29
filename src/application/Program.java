package application;

import java.util.Locale;
import java.util.Scanner;

import util.Cadastro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cadastro cadastrar;

		System.out.println("Informe os dados abaixo.");
		System.out.print("Numero da conta:");
		int conta = sc.nextInt();

		System.out.print("Nome do Titular da conta:");
		sc.nextLine();
		String nome = sc.nextLine();

		System.out.print("Terá deposito inicial? (s/n)");
		char aux = sc.next().charAt(0);

		if (aux == 's') {
			System.out.print("Valor de deposito inicial:");
			double deposito = sc.nextDouble();
			cadastrar = new Cadastro(conta, nome, deposito);
		} else {
			cadastrar = new Cadastro(conta, nome);
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(cadastrar.toString());

		System.out.println();
		System.out.println("Insira o valor a ser depositado: ");
		double valor = sc.nextDouble();
		cadastrar.Deposito(valor);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cadastrar.toString());

		System.out.println();
		System.out.println("Insira o valor a ser sacado: ");
		valor = sc.nextDouble();
		cadastrar.Saque(valor);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(cadastrar.toString());

		sc.close();
	}

}
