package aulas;

import java.util.Scanner;

public class aula11_Scanner
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double base, altura, a;
		
		System.out.print("Base: ");
			base = input.nextDouble();
		System.out.print("Altura: ");
			altura = input.nextDouble();
			
		a = base*altura;
		
		System.out.println("Base: "+base);
		System.out.println("Altura: "+altura);
		System.out.println("Area: "+a);

	}

}
