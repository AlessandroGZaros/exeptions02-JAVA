package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Digite os dados da conta:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular: ");
		String holder = sc.nextLine();
		System.out.print("Deposito inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder,balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Digite a quantia que auer sacar: R$ ");
		double amount = sc.nextDouble();
		acc.withdraw(amount);
		System.out.print("Saldo atualizado: R$ " + String.format("%.2f",acc.getBalance()));
		}
		catch(DomainException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
