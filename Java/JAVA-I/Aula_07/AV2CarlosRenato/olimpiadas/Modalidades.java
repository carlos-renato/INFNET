package olimpiadas;

public class Modalidades
{
	private String nome;
	private float SalarioMedio;
	
	public static Modalidades CriarModalidades(String nome, float salarioMedio)
	{
		Modalidades x = new Modalidades();
		x.setNome(nome);
		x.setSalarioMedio(salarioMedio);
		return x;
	}
	
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	public float getSalarioMedio()
	{
		return SalarioMedio;
	}
	public void setSalarioMedio(float salarioMedio)
	{
		SalarioMedio = salarioMedio;
	}
	
	
}
