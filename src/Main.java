
public class Main {

	public static void main(String[] args) {
		Cliente Pedro = new Cliente();
		Pedro.setNome("Pedro");
		
		
		Conta cc = new ContaCorrente(Pedro);
		Conta poupanca = new ContaPoupanca(Pedro);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
