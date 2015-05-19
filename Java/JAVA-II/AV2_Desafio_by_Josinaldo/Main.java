package exercicio01;

import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		//Criacao das contas
		Conta conta01 = new Conta(700, TipoDeConta.CC);
		Conta conta02 = new Conta(200, TipoDeConta.CS);

		//Criacao dos clientes
		Cliente cliente01 = new Cliente("Luiz Inacio Lulinha", 60, 1717, conta01);
		Cliente cliente02= new Cliente("Dilminha Roussef", 55, 7171, conta02);

		//Criando lista e armazenando clientes
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		listaClientes.add(cliente01);
		listaClientes.add(cliente02);

		//Criando Banco
		Banco banco = new Banco("Cuba-cuba", listaClientes);

		banco.exibeClientes();
		Cliente.maisRico(banco.getClientes());
	}
}
