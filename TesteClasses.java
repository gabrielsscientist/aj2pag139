package aj2pag139;

public class TesteClasses {

	public static void main(String[] args) {
		Banco banco1 = new Banco();
		banco1.nome = "Itaú";
		banco1.numero = 1651;
		
		Agencia agencia1 = new Agencia();
		agencia1.banco = banco1;
		agencia1.nome = "Agência do centro";
		agencia1.numero = "2400";
		
		Cliente cliente1 = new Cliente();
		cliente1.cpf = "123.456.789-10";
		cliente1.nome = "Joaquim Oliveira";
		
		Conta conta1 = new Conta();
		conta1.agencia = agencia1;
		conta1.cliente = cliente1;
		conta1.saldo = 10000.00;
		conta1.numero = "98765-5";
		conta1.imprimeConta();
		
		conta1.deposito(5000);
		conta1.imprimeConta();
	}

}
