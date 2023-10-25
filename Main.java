package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Pessoa ps = new Pessoa();
		System.out.println("Digite o nome: ");
		ps.setNome(sc.next());
		System.out.println("Digite o CPF: ");
		ps.setCpf(sc.nextLong());
		System.out.println("Digite a idade: ");
		ps.setIdade(sc.nextInt());
		System.out.println("Digite o saldo: ");
		ps.setSaldo(sc.nextInt());
		System.out.println("Digite o valor do depósito: ");
		ps.Depositar(sc.nextInt());
		System.out.println("Digite o valor do saque: ");
		ps.Saque(sc.nextInt());
		System.out.println(ps);
		
		
	}

}
