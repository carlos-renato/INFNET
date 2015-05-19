package testes;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		//ArrayList para receber as maior empresas do mundo.
		ArrayList<String> empresas = new ArrayList<>(10);
		empresas.add("Walmart Company");
		empresas.add("Dutch Shell");
		empresas.add("Sinopec Group");
		empresas.add("China Petroleum");
		empresas.add("Exxon Mobil");
		empresas.add("B P");
		empresas.add("State Grid");
		empresas.add("Volkswagen Motors");
		empresas.add("Toyota Motor");
		empresas.add("Chevron Petroleum");
		
		System.out.println("------- Imprimindo as empresas--------");
		for(String e: empresas)
		{
			System.out.println(e);
		}
		System.out.println("\n------- Caixa alta--------");
		for(String e: empresas)
		{
			System.out.println(e.toUpperCase());
		}
		System.out.println("\n-------Caixa baixa--------");
		for(String e: empresas)
		{
			System.out.println(e.toLowerCase());
		}
		System.out.println("\n-------Tamanho de cada nome---------");
		for(String e: empresas)
		{
			System.out.println(e+" "+e.length());
		}
		System.out.println("\n--------Concat----------");
		for(String e: empresas)
		{
			String[] lista = new String[2];
			lista[0] = e.split(" ")[0];
			lista[1] = e.split(" ")[1];
			System.out.println(lista[0].concat(lista[1]));
		}
		System.out.println("\n--------Substituir 'a' -> '4'---------");
		for(String e: empresas)
		{
			System.out.println(e.replace('a', '4'));
		}
		System.out.println("\n--------Substituir \"XxXxX\" por \"ch\"");
		for(String e: empresas)
		{
			System.out.println(e.replaceAll("ch", "XxXxX"));
		}
		System.out.println("\n--------Imprimindo pelas iniciais----------");
		for(String e: empresas)
		{
			if(e.startsWith("W"))
				System.out.println(e);
		}
		System.out.println("\n--------Imprimindo pelo final----------");
		for(String e: empresas)
		{
			if(e.endsWith("m"))
				System.out.println(e);
		}
		System.out.println("\n--------Imprimindo pela inicial do 2o nome--------");
		for(String e: empresas)
		{
			String[] nome = new String[2]; 
			nome[0] = e.split(" ")[0];
			nome[1] = e.split(" ")[1];
			
			if(nome[1].startsWith("M"))
				System.out.println(nome[1]);
			
		}
	}
}
