package projeto;

import java.util.Scanner;

public class Main extends Conta {

	public static void main(String[] args) {
		
		//Criação do objeto
		Conta conta = new Conta();	
		
		// Leitura de dados no console
		Scanner scan = new Scanner(System.in);
		int resp;
		
		// Menu Principal
		do {
			System.out.println("-------------------------------------------");
			System.out.println("      :::BEM VINDO AO BANCO SOARES:::      ");
			System.out.println("-------------------------------------------");
			System.out.println("\nDigite abaixo a opção desejada:");
			System.out.println("(1). Abrir conta");
			System.out.println("(2). Sacar");
			System.out.println("(3). Depositar");
			System.out.println("(4). Ver saldo");
			System.out.println("(5). Fechar conta");
			System.out.println("(6). Sair do programa");
			System.out.println("\nResposta: ");
			resp = scan.nextInt();
			
			switch(resp) {
				case 1:{
					if(conta.getStatus() == true) {
						System.out.println("\n***Operação inválida, pois já existe uma conta cadastrada!***\n");
					}
					else {
						conta.abrirConta();
					}
				    break;
				}
				case 2:{
					if(conta.getStatus() == false) {
						System.out.println("\n***Operação inválida, pois não existe nenhuma conta cadastrada!***\n");
					}
					else if(conta.getSaldo() == 0) {
						System.out.println("\n***Operação inválida, pois você ainda não possui nenhum saldo no banco!***\n");
					}
					else {
						
						System.out.println("-------------------------------------------");
						System.out.println("                :::SAQUE:::                ");
						System.out.println("-------------------------------------------");
						System.out.println("\nDigite o valor que queira sacar:");
						double valor = scan.nextDouble();
						conta.sacar(valor);
					}
					break;
				}
				case 3:{
					if(conta.getStatus() == false) {
						System.out.println("\n***Operação inválida, pois não existe nenhuma conta cadastrada!***\n");
					}
					else {
						System.out.println("-------------------------------------------");
						System.out.println("              :::DEPÓSITO:::               ");
						System.out.println("-------------------------------------------");
						System.out.println("\nDigite o valor que queira depositar:");
						double valor = scan.nextDouble();
						conta.depositar(valor);
					}
					break;
				}
				case 4:{
					if(conta.getStatus() == false) {
						System.out.println("\n***Operação inválida, pois não existe nenhuma conta cadastrada!***\n");
					}
					else {
						System.out.println("-------------------------------------------");
						System.out.println("                :::SALDO:::                ");
						System.out.println("-------------------------------------------");
						System.out.println("\nSaldo: R$" + conta.getSaldo());
					}
					break;
				}
				case 5:{
					if(conta.getStatus() == false) {
						System.out.println("\n***Operação inválida, pois não existe nenhuma conta cadastrada!***\n");
					}
					else {
						conta.fecharConta();
					}
					break;
				}
				case 6:{
					System.exit(0);
				}
			}
		}
		while(resp != 6); 
		scan.close(); // Fechando a leitura de dados no console
	}
}
