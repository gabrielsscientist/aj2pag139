package aj2pag139;

public class Agencia {
	String numero;
	String nome;
	Banco banco;
	
	void imprimeAgencia(){
		System.out.println("O n�mero da ag�ncia "+this.nome+" � "+this.numero);
	}
}
