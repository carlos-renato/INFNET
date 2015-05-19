package vetores;

public class OiTchau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] frases = {"Oi", "Tchau"};
		for (String frase1 : frases) { // esse for puxa o laço duas vezes
			for (String frase2 : frases) {
				if(frase2.equals("Tchau")) break; // quebra o laço de dentro
					System.out.print(frase2 + ":");
			}
		}
	}

}
