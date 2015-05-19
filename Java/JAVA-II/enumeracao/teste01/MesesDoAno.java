package teste01;

public enum MesesDoAno
{
	JANEIRO("1"), FEVEREIRO("2"), MARCO("3"), ABRIL("4"), MAIO("5"), JUNHO("6");
	
	public String numero;
	//A partir do momento que eu atribuo valores às constantes, preciso fazer um construtor.
	MesesDoAno(String numero)
	{
		this.numero = numero;
	}
}
