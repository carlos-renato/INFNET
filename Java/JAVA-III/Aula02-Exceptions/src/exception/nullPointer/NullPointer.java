package exception.nullPointer;

public class NullPointer {

	public static void main(String[] args) {
		String nome = null;
		System.out.println("Imprimindo o tamanho do 'nome'...\n");
		try {
			System.out.println(nome.length()); // NullPointerException
		} catch (NullPointerException npe) {
			System.out.println("Campo 'nome' esta vazio.");
		}
	}

}
