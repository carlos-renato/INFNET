package teste01;

public enum Cursos
{
	BASICO1("Breaking Free"),
	BASICO2("Spreading Wings"),
	INTERMERIARIO1("Aiming At the Sky"),
	INTERMEDIARIO2("Flying High"),
	AVANCADO1("Expanding Horizons"),
	AVANCADO2("Wings of Freedom");
	
	//Construtor padrão para as constantes
	Cursos(String book)
	{
		
	}
	
	//método de acesso às constantes
	public String getBook(String book)
	{
		return book;
	}

}
