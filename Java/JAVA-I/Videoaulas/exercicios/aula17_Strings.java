package aulas;

import java.util.Scanner;

public class aula17_Strings {

	public static void main(String[] args) {
		
		String pNome;
		String uNome;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual e seu primeiro nome? ");
		pNome = input.next();
		System.out.println("Qual e seu ultimo nome?");
		uNome = input.next();
		System.out.println("Qual e sua idade? ");
		idade = input.nextInt();
		System.out.println(pNome+" "+uNome+" de "+idade+" anos.");
	}

}
