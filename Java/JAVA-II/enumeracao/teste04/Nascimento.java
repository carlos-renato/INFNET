package teste04;

public enum Nascimento
{
	//constantes e seus valores
	CARLOS(1987), LIDIANE (1987), JOAO(1920), PEDRO(1977);
	
	//variavel privada para proteger o acesso
	private int ano;
	
	//construtor padrão, por causa da atribuição dos valores
	Nascimento(int ano)
	{
		this.ano = ano;
	}
	
	//metodo de acesso à varial protegida 
	public int getAno()
	{
		return ano;
	}
		
}
