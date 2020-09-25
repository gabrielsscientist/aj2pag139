package aj2pag139;

public class Agencia {
	String numero;
	String nome;
	Banco banco;
	
	void imprimeAgencia(){
		System.out.println("O número da agência "+this.nome+" é "+this.numero);
	}
}
