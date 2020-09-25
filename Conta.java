package aj2pag139;

public class Conta {
	double saldo;
	String numero;
	Agencia agencia;
	Cliente cliente;
	
	void imprimeConta() {
		System.out.println("O saldo da conta "+this.numero+" � de R$"+this.saldo);
	}
	
	void saque(double valor) {
		if(valor > saldo)
			System.out.println("ERRO, O saldo � menor que o valor inserido");
		if(valor <= 0)
			System.out.println("ERRO (n�o � poss�vel depositar um valor menor ou igual a zero)");
		else
			saldo -= valor;
	}
	
	void deposito(double valor) {
		if(valor <= 0)
			System.out.println("ERRO (n�o � poss�vel depositar um valor menor ou igual a zero)");
		saldo += valor;
	}
}
