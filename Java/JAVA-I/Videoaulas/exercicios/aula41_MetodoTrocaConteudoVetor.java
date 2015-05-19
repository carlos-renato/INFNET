package aulas;

public class aula41_MetodoTrocaConteudoVetor
{

	public static void main(String[] args)
	{
		int[] vet = {1,2,3,4,5};
		
		troca(vet);
		
		for(int i: vet)
		{
			System.out.print(i+" ");
		}
		
	}
	
	public static void troca(int[] x)
	{
		int aux;
		
		for(int i = 2; i < x.length; i++)
		{
			aux = x[i];
			x[i] = x[((x.length-i)-1)];
			x[((x.length-i)-1)] = aux;			
		}
	}
	
}
