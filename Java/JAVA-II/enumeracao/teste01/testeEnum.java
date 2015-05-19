package teste01;

public class testeEnum
{
	public static void main(String[] args)
	{
		System.out.println(MesesDoAno.ABRIL);
		System.out.println(MesesDoAno.JANEIRO.numero);
		
		for(MesesDoAno x: MesesDoAno.values())
		{
			System.out.println(x+ ": "+x.numero);
		}
	}
		
	
}
