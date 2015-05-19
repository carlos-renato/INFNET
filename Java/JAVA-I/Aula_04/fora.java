package vetores;

public class fora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] frases = {"Oi", "Tchau"};
		
		fora: //rótulo
		for (String frase1 : frases) {
			for (String frase2 : frases) {
				if(frase2.equals("Tchau")) break fora;
					System.out.print(frase2 + ":");
			}
		}

	}

}
