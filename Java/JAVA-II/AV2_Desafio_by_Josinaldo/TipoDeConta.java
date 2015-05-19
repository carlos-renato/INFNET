package exercicio01;

public enum TipoDeConta
{
	CC("Conta-Corrente"),
	CP("Conta-Poupanca"),
	CS("Conta-Salario");

	private String valor;

	//Construtor
	TipoDeConta(String valor)
	{
		this.valor = valor;
	}
}
