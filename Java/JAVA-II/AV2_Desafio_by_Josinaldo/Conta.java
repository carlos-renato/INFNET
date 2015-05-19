package exercicio01;

public class Conta
{
	//Propriedades privadas para seguir as regras de encapsulamento
	private double saldo;
	private TipoDeConta tipo;

	//Construtor
	public Conta(double saldo, TipoDeConta tipo) {
		this.saldo = saldo;
		this.tipo = tipo;
	}

	//Sobrescrevendo toString para impressao dos atributos de Conta
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	//Metodo de acesso a propriedade privada
	public double getSaldo() {
		return saldo;
	}
}
