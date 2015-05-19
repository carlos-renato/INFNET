package teste01;

public class Main
{
	public static void main(String[] args)
	{
		//Criação de Strings
		char[] nome = new char[]{'C','A','R','L','O','S'};
		System.out.println(nome);
		
		String frase = "Os que confiam no Senhor são como os montes de Sião, que não se abalam mas permanecem para sempre";
		
		//Compara Strings e retorna true/false
		//.equals() retorna compara o valor
	
		String string1 = new String("Carlos");
		String string2 = new String("Renato");
		System.out.println(string1.equals(string2));
	
		//== compara referência
		//Por que dá true?
		String a = "abc";
		String b = "abc";
		System.out.println(a==b);
		
		System.out.println(string1.charAt(3));
		System.out.println(string2.indexOf('S'));
		System.out.println(frase.substring(frase.indexOf('S'), frase.indexOf('S')+6));
		
	}
}
