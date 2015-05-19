package aulas;

import java.util.Scanner;

public class aula13_Constantes
{

	public static void main(String[] args)
	{
		final double PI = 3.1415;//'final' antes do tipo indica que e uma constante.
		double raio, area;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Raio: ");
		raio = input.nextDouble();
		
		area = raio*raio*PI;
		
		System.out.print(area);
	}

}
