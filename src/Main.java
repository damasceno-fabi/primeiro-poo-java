
public class Main { 

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.setNome("Bruno");
		Cliente fabiola = new Cliente();
		fabiola.setNome("Fabíola");
		
		Conta cc = new ContaCorrente(bruno);		
		Conta poupanca = new ContaCorrente(fabiola);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
