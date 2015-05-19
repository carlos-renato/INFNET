package exercicio01;

import java.util.ArrayList;

public class Banco
{
	//Propriedades privadas para seguir as regras de encapsulamento
	private String nome;
	private ArrayList<Cliente> clientes; //Tipo lista porque um banco pode ter muitos clientes

	//Construtor
	public Banco(String nome, ArrayList<Cliente> clientes) {
		this.nome = nome;
		this.clientes = clientes;
	}

	//Metodo para exibir todos os clientes
	public void exibeClientes()
	{
		for(Cliente c: clientes)
		{
			System.out.println(c);
		}
	}

	//Metodo de acesso a propriedade privada
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
