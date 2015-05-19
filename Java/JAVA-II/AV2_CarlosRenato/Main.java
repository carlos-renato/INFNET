package avaliacao;

public class Main {

	public static void main(String[] args) {
	
		FraseAleatoria frase01 = new FraseAleatoria();
		System.out.println("Frase gerada: "+frase01.getRandomPhrase());
		FraseAleatoria.mostraRepeditos(frase01.getRandomPhrase(), 'z');
		
		FraseAleatoria.replaceChar("\nTroca de caracteres: "+frase01.getRandomPhrase(), 'm');

	}
}
