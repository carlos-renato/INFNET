package teste03;

public enum Amigo
{
	JUNIOR("Rayane","1"),
	ISAAC("Solteiro","1"),
	LOPES("Solteiro","0"),
	JONATAS("Juliana","1"),
	FLAVIO("Danielle","1"),
	PABLO("Claudia","1");
	
	//meu construtor para esta enumeração
	Amigo(String wife, String children)
	{
		this.esposa = wife;
		this.filhos = children;
	}
	
	private String esposa;
	private String filhos;
	
	//metodos que pegam os valores das constantes
	
	public String getEsposa()
	{
		return esposa;
	}

	public String getFilhos()
	{
		return filhos;
	}
}
