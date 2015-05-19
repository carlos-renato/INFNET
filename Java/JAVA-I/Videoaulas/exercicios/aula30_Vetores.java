package aulas;

import java.util.Scanner;

public class aula30_Vetores
{

	public static void main(String[] args)
	{
	
	int[] vet = new int[5];
	int i, j = 5;
	
	Scanner num = new Scanner(System.in);
	
	for(i = 0; i < j; i++)
	{
		System.out.print("Ente com um numero: ");
		vet[i] = num.nextInt();
		
	}
	
	System.out.print("As entradas foram: ");
	for(i=0; i < j; i++)
	{
		System.out.print(vet[i]+" ");
	}
		
		
	}

}
