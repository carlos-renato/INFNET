package teste04;

public class TesteEnum
{
	public static void main(String[] args)
	{
		for(Nascimento n: Nascimento.values())
		{
			System.out.println(n+" nascido em "+n.getAno());
		}
	}

}
