package exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList<String> frases = new ArrayList<>();
		frases.add("Roma me tem amor");
		frases.add("Um prato de trigo para um tigre triste");
		frases.add("Matam");
		frases.add("Traz a caçamba, traz a caçamda e joga tudo aí");
		frases.add("Uma vez Flamengo, sempre Flamengo, Flamengo sempre eu ei de ser");

		for(int i = 0; i < frases.size(); i++)
		{
			System.out.println(frases);
		}
		
		Scanner input = new Scanner(System.in);
		
		//Menu.menuEntrada(input.nextInt());

	}

}
