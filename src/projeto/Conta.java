package projeto;

import java.util.Scanner;

public class Conta extends Cliente{

	private String nomeBanco = "RSoares";
	private int agencia;
	private int numeroConta;
	protected int tipo;
	private double saldo;
	private boolean status;
	
	public Conta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void abrirConta() {
	
		Scanner scan = new Scanner(System.in);
	
		this.setStatus(true);
		System.out.println("------------------------------");
		System.out.println("Bem vindo ao Banco " + this.getNomeBanco());
		System.out.println("------------------------------");
		System.out.println("Escolha uma op��o abaixo:");
		System.out.println("(1). Para abrir uma conta corrente");
		System.out.println("(2). Para abrir uma conta poupan�a");
		System.out.println("Resposta: ");
		
		int t = scan.nextInt();
		
		switch(t) {
			case 1:{
				System.out.println("Nome: " + this.getDono());
				System.out.println("CPF: " + this.getCpf());	
				System.out.println("Ag�ncia: " + this.getAgencia());	
				System.out.println("Numero da Conta: " + this.getNumeroConta());	
				System.out.println("Parab�ns! Voc� acabou de criar uma conta corrente!");
				System.out.println("--------------------------------------------------");
				System.out.println("Como presente, receba R$50,00!");
				this.setSaldo(this.getSaldo() + 50);	
				System.out.println("Saldo: R$" + this.getSaldo());
				break;
			}
			case 2:{
				System.out.println("Nome: " + this.getDono());
				System.out.println("CPF: " + this.getCpf());	
				System.out.println("Ag�ncia: " + this.getAgencia());
				System.out.println("Numero da Conta: " + this.getNumeroConta());
				System.out.println("Parab�ns! Voc� acabou de criar uma conta poupan�a!");
				System.out.println("--------------------------------------------------");
				System.out.println("Como presente, receba R$20,00!");
				this.setSaldo(this.getSaldo() + 20);	
				System.out.println("Saldo: R$" + this.getSaldo());
				break;
			}
		}
		scan.close();
	}
	
	public void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta n�o pode ser fechada, pois ainda tem saldo!");
			System.out.println("Saldo: R$" + this.getSaldo());
		}
		else if(this.getSaldo() < 0) {
			System.out.println("Conta n�o pode ser fechada, pois ainda tem d�bito");
			System.out.println("Saldo: R$" + this.getSaldo());
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void sacar(double valor) {
	
		if(this.getStatus() && valor <= this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Saque realizado com sucesso!");
			System.out.println("Saldo: R$" + this.getSaldo());
		}
		else{
				System.out.println("Saldo insuficiente!");
				System.out.println("Saldo: R$" + this.getSaldo());
		}
	}
	
	public void depositar(double valor) {
		
		if(this.getStatus() && valor > 0) {
			//if() {
				this.setSaldo(this.getSaldo() + valor); 
				System.out.println("Deposito realizado com sucesso!");
				System.out.println("Saldo: R$" + this.getSaldo());
			//}
		}
		else {
			System.out.println("Valor insuficiente para dep�sito!");
			System.out.println("Saldo: R$" + this.getSaldo());
		}
	}
	
	public void transferir(double valor) {
		
		if(this.getStatus() && valor <= this.getSaldo()) {		
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Transfer�ncia realizada com sucesso!");
			System.out.println("Saldo: R$" + this.getSaldo());
		}
		else {
			System.out.println("Saldo insuficiente para realizar transfer�ncia!");
		}
	}
		
	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

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
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
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
