package projeto;

public class Main {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.setDono("Clara");
		c1.setCpf(123456789);
		c1.setAgencia(1234);
		c1.setNumeroConta(1111000);
		
		c1.abrirConta();
		c1.depositar(100);
		c1.sacar(49);
		c1.transferir(50);
		c1.sacar(10);
		c1.transferir(1000);
		c1.fecharConta();
		c1.sacar(41);
		c1.fecharConta();
	}	
}
