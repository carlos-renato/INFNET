package comparacao01;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		//coleção para para armzenas pessoas
		ArrayList<Person> lista = new ArrayList<>();

		//criando pessoas
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		Person d = new Person();

		//atribuindo características às pessoas
		a.setName("Carlos");
		a.setCpf(123);
		b.setName("Lidiane");
		b.setCpf(456);
		c.setName("Israel");
		c.setCpf(789);
		d.setName("Carlos");
		d.setCpf(123);

		//adicionando pessoas à lista.
		lista.add(a);
		lista.add(b);
		lista.add(c);

		//método que verifica se a pessoa desejada se encontra na lista.
		Person.verificaLista(d, lista);

	}
}
