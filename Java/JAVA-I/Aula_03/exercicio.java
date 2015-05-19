
public class exercicio {

	public static void main(String[] args)
	{
		int[] vet = {23,36,35,95,78,95,12,64,68,89,51,22,37,69,100,58,98,57,79,40};
		
		for (int i: vet) {
			if (i % 2 == 0){
				System.out.println(i+" é múltiplo de 2");
			}
		}
	}

}
