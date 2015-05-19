import java.util.Scanner;

public class bissexto {

	public static void main(String[] args)
	{
		int ano; // receberá o ano pelo usuário
		
		Scanner input = new Scanner(System.in);
		// Scanner (tipo_var) input (nome_var) = new (chamar construtor) Scanner (nome_construtor) (System.in); 
		
		System.out.println("Insira o ano: ");
		ano = input.nextInt(); // variável 'ano' recebe entrada do teclado
		
		//System.out.print("Ano: "+ano);
		
		if (((ano % 4 == 0) && (ano % 100 != 0)) ||  (ano % 400 == 0)) {
			System.out.println("Ano bissexto");
		}
		else {
			System.out.println("Ano não é bissexto");
		}
	}
}
