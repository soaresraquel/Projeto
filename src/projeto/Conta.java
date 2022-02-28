package projeto;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Raquel
 *
 */

public class Conta extends Cliente{
	// Atributos
	private int agencia = 1234;
	private int numeroConta;
	private String tipo;
	private double saldo;	
	private boolean status;
	
	// M�todo construtor
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	// Leitura de dados no console
	Scanner scan = new Scanner(System.in);
	
	// M�todo para abrir conta
	public void abrirConta() {
	
		Random aleatorio = new Random(); // Para gerar n�mero aleat�rio
		numeroConta = aleatorio.nextInt(999999) + 100000; // Gerando n�mero de conta alet�rio de 6 d�gitos, iniciando em 100000
				
		this.setStatus(true);
		
		// Intera��o com o usu�rio para escolha do tipo de conta
		System.out.println("\nEscolha uma op��o abaixo:");
		System.out.println("(CC). Para abrir uma conta corrente");
		System.out.println("(CP). Para abrir uma conta poupan�a");
		System.out.println("\nResposta: ");
		String resp = scan.next();
		
		while(!(resp.equals("CC")) && !(resp.equals("CP"))) {
			System.out.println("\n***Opera��o inv�lida! Digite um caracter v�lido!***\n");
			System.out.println("\nResposta: ");
			resp = scan.next();
		}
		this.setTipo(resp);
		
		System.out.println("\nNome: ");
		nome = scan.next();
		System.out.println("CPF: ");	
		cpf = scan.nextInt();
		
		if(resp.equals("CC")) {
			System.out.println("\n***Conta corrente criada com sucesso!***");
			System.out.println("-------------------------------------------");
			System.out.println("            :::CONTA CORRENTE:::           ");
			System.out.println("-------------------------------------------");
			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf());
			System.out.println("Ag�ncia: " + this.getAgencia());
			System.out.println("Conta: " + this.getNumeroConta());
			System.out.println("\n => Detalhes da conta:");
			System.out.print(" - B�nus de R$50,00 na conta!\n");
			System.out.println("-------------------------------------------\n");
			this.setSaldo(50);
		}
		else if(resp.equals("CP")) {
			System.out.println("\n***Conta poupan�a criada com sucesso!***");
			System.out.println("-------------------------------------------");
			System.out.println("            :::CONTA POUPAN�A:::           ");
			System.out.println("-------------------------------------------");
			System.out.println("Nome: " + this.getNome());
			System.out.println("CPF: " + this.getCpf());
			System.out.println("Ag�ncia: " + this.getAgencia());
			System.out.println("Conta: " + this.getNumeroConta());
			System.out.println("\n => Detalhes da conta:");
			System.out.print(" - B�nus de R$10,00 na conta! \n");
			System.out.println("-------------------------------------------\n");
			this.setSaldo(10);
		}
	}
	
	//M�todo para fechar conta
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("\n***Conta n�o pode ser fechada, pois ainda tem saldo!***\n");
		}
		else {
			this.setStatus(false);
			System.out.println("\n***Conta fechada com sucesso!***\n");
		}
	}
	
	// M�todo para sacar o dinheiro
	public void sacar(double valor) {
		if(this.getStatus() && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("\n***Saque realizado com sucesso!***\n");
		}
		else{
			System.out.println("\n***Saldo insuficiente!***\n");
		}
	}
	
	// M[etodo para depositar dinheiro
	public void depositar(double valor) {
		
		if(this.getStatus() && valor > 0) {
				this.setSaldo(this.getSaldo() + valor); 
				System.out.println("\n***Dep�sito realizado com sucesso!***\n");
		}
		else {
			System.out.println("\n***Valor insuficiente para dep�sito!***\n");
		}
	}
	// M�todos Acessores
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
		
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
