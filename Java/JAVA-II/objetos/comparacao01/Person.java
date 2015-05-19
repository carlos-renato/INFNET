package comparacao01;
import java.util.ArrayList;

public class Person
{
	private String name;
	private int cpf;
	
	//metodos de acesso às variáveis privadas (encapsulamento)
	public int getCpf()
	{
		return cpf;
	}
	public void setCpf(int cpf)
	{
		this.cpf = cpf;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	/* Alteração no método "equals" para que não compare objetos apenas por
   endereço, e sim pelos parâmetros que desejo */

	public boolean equals(Object obj)
	{
		/* pegando o objeto recebido(padrão) e e fazendo um Casting para trabalhar
		 * com ele nos seguindo os parâmetros da classe PERSON. */
		Person local = (Person) obj;
		if(obj instanceof Person)
		{
			if(local.name.equals(this.name) && local.cpf == this.cpf) 
				return true;
		}
		return false;
	}
	//método público e estático para ser acessível pela main
	public static void verificaLista(Person p, ArrayList<Person> lista)
	{
		if(lista.contains(p))
			System.out.println("A pessoa "+p.name+", com o CPF "+p.cpf+", está na lista");
		else
			System.out.println("A pessoa "+p.name+", com o CPF "+p.cpf+", não foi encontrada na lista");
	}
}
