package aulas;

public class aula12_Casting
{

	public static void main(String[] args)
	{
		int x = 10;
		int y = 6; int z = 3;
		double a= 3; double b = 1.0;
		double c = (double) (x/y); // divisao de int gera int e depois faz o Casting.

		System.out.println("x= "+x);
		System.out.println("y= "+y);
		System.out.println("z= "+z);
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("c= "+c);
		
	}

}
