package avaliacao;

import java.util.Random;

public class FraseAleatoria
{	
	//Constante que define o tamanho da String
	final int TAM = 25;
	
	//Variável que armazena a frase aleatória
	private String randomPhrase;

	//Construtor 01
	FraseAleatoria()
	{
		//Vetor de onde as frases serão geradas
		char[] charVet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		StringBuilder newString = new StringBuilder();
		Random random = new Random();
		//Geração da frase
		for (int i = 0; i < TAM; i++) {
			char c = charVet[random.nextInt(charVet.length)];
			newString.append(c);
		}
		this.randomPhrase = (newString.toString());
	}

	//Construtor 02 (para receber o tamanho da frase)
	FraseAleatoria(int tam)
	{
		tam = 25;
	}

	public String getRandomPhrase() {
		return randomPhrase;
	}
	
	//Método que checa as repetições
	public static void mostraRepeditos(String frase, char x)
	{
		char tem;
		int cont = 0;

		for(int i = 0; i < ((frase.length()-1)-frase.indexOf(i)); i++)
		{
				tem = frase.charAt(i);
				if (tem == x)
						{
							cont++;
						}
		}
		System.out.println("O caractere -"+x+"- aparece "+cont+" vez(es) na frase.");
	}
	
	//método para substituir caracteres
	public static void replaceChar(String frase, char x)
	{ 
		System.out.println(frase.replace(x, '?'));
	}
}
