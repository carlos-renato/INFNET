package exercicio01;

import java.util.ArrayList;

public class Cliente
{
	//Propriedades privadas para seguir as regras de encapsulamento
	private String nome;
	private int idade;
	private int telefone;
	private Conta conta;

	//Construtor 1
	public Cliente(String nome, int idade, int telefone, Conta conta) {
		this(nome, conta);
		this.idade = idade;
		this.telefone = telefone;
	}

	//Construtor 2
	public Cliente(String nome, Conta conta) {
		this.nome = nome;
		this.conta = conta;
	}

	//Encapsulamento
	public Conta getConta() {
		return conta;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public int getTelefone() {
		return telefone;
	}
	
	//Sobrescrevendo toString para impressao dos atributos de cliente
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + ", telefone="
				+ telefone + ", conta=" + conta + "]";
	}
	
	//Fazendo com que clientes sejam comparados por nome e telefone

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cliente)
		{
			Cliente c = (Cliente) obj;
			if (c.getNome().equals(this.getNome()) && c.getTelefone() == this.getTelefone())
				return true;
			else
				return false;
		}
		return false;

	}

	//Metodo para exibir cliente com maior saldo
	public static void maisRico(ArrayList<Cliente> lista)
	{
		Cliente atual = lista.get(0);
		for(Cliente c: lista)
		{
			if(c.conta.getSaldo() > atual.conta.getSaldo())
				atual = c;
		}	
		if (atual.getNome().split(" ").length == 3)
			System.out.println("Cliente mais rico e: "+atual.getNome().split(" ")[2].toUpperCase());
		else
			if (atual.getNome().split(" ").length == 2)
				System.out.println("Cliente mais rico e: "+atual.getNome().split(" ")[1].toUpperCase());
	}
}
