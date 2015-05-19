package exercicio01;

public class Menu
{
	private int input;

	public int getInput() {
		return input;
	}

	public void setInput(int input) {
		this.input = input;
	}

	public static void menuEntrada(int input)
	{
		System.out.println("Entre com o número da frase");
		System.out.println("[1] Palíndromo \t [2] Mais Longa \t [3] Capitulção");
		switch (input){
		case 1:

		case 2:

		case 3:

		default:
			System.out.println("[ERRO]: Entrada nula. O programa foi encerrado.");

		}
	}
}
