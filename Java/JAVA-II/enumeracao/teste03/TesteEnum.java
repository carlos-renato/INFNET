package teste03;

public class TesteEnum
{
	public static void main(String[] args)
	{
		//imprimindo as constantes pelo nome
		for(Amigo a: Amigo.values())
		{
			System.out.println(a);
		}
		
		//imprimindo as constantes pelo valor
		for(Amigo a: Amigo.values())
		{
			if(a.getEsposa() == "Solteiro")
				System.out.println(a+" é "+a.getEsposa()+" e tem "+a.getFilhos()+" filho(s).");
			if(a.getEsposa() != "Solteiro")
				System.out.println(a+" é casado com "+a.getEsposa()+" e tem "+a.getFilhos()+" filho(s).");
				
		}
	}

}
