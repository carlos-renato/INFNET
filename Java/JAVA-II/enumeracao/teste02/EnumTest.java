package teste02;

public class EnumTest
{
	public static void main(String[] args)
	{
		for(Clubes c: Clubes.values())
		System.out.println(c+" "+c.getRegiao()+" "+c.getState());
	}
}
