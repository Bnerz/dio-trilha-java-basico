package Application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int numero;
		String agencia;
		String nomeCliente;
		double saldo = 0.0;

		System.out.println("Por Favor digite o numero da Agencia");
		numero = sc.nextInt();
				
		System.out.println("Agora digite o numero da Conta");
		sc.nextLine();
		agencia = sc.nextLine();
		
		System.out.println("Favor digitar o nome do cliente");
		nomeCliente = sc.nextLine();
		
		System.out.println("Digite o saldo");
		saldo = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: " + numero + " e seu saldo: R$ " + saldo + " já está disponível para saque.");
		
	}

}
