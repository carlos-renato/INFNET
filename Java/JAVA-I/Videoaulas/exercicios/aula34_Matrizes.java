package aulas;

import java.util.Scanner;

public class aula34_Matrizes
{

	public static void main(String[] args)
	{
		int[][] x = new int[3][3];
		int num, i, j;
		Scanner input = new Scanner(System.in);
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[i].length; j++)
			{
				System.out.print("Entre com um numero: ");
				x[i][j] = input.nextInt();
			}
		}
		
		for(i = 0; i < x.length; i++)
		{
			for(j = 0; j < x[i].length; j++)
			{
				System.out.print(i+"|"+j + " = " + x[i][j]+"\t\t");
				
				
			}
			System.out.println("");
		}	
		
	}

}
