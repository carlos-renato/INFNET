package exception.exemplo01;

public class Trace {
	/*
	 * Erro acontece no 'method3()', que joga para o 'method2()', que joga para
	 * o 'method01', que joga para 'main()'
	 */
	public static void main(String args[]) {
		method1();
	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		method3();
	}

	public static void method3() {
		String[] alunos = { "Daniel", "Daniela" };
		System.out.println(students[1]);
		/*
		 * Runtime exception
		 * Busca por um vetor que nao existe.
		 */
	}
}