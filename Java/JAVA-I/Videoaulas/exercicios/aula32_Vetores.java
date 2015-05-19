package aulas;

public class aula32_Vetores
{

	public static void main(String[] args)
	{
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		int i = 0;
		java.util.Arrays.fill(vet1, 1, 4, 6);
		
		
		for(i = 0; i < vet1.length; i++)
		{
			System.out.print(vet1[i]+" ");
		}

	}

}
