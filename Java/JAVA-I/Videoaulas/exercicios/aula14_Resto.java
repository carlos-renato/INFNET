package aulas;

import java.util.Scanner;

public class aula14_Resto {

	public static void main(String[] args)
	{
		int gramas, kilos;
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Gramas: ");
		gramas = input.nextInt();
		
		kilos = gramas / 1000;
		gramas = gramas % 1000;
		
		System.out.println("Kilos: "+ kilos);
		System.out.println("Gramas: "+ gramas);
	}

}
