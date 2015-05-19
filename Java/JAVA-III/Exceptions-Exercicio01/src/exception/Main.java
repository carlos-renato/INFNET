package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import exception.exercicio.Imc;
import exception.exercicio.Usuario;

public class Main {

	// Criando minha exce��o
	public class EntradaZeroException extends RuntimeException {
		public EntradaZeroException(String message) {
			super(message);
		}
	}

	// M�todo que retorna o lan�amento da minna exce��o
	public void verificaCaloria(double _cal) {
		if (_cal <= 0) {
			throw new EntradaZeroException(
					"[ERRO]: Quantidade de calorias menor ou igual a 0...\n");
		}
	}

	public static void main(String[] args) {

		// Criando um usu�rio
		Usuario user00 = new Usuario("Pedro Pena", 17, 1.56, 70);
		Scanner input = new Scanner(System.in);
		Main x = new Main();

		// Vari�vei de inst�ncia
		int cont = 0;
		double c;

		System.out.println("Entre com a quantidade de calorias");
		do {
			System.out.println((cont + 1) + "o dia: ");
			c = input.nextDouble();

			// Bloco try
			try {
				x.verificaCaloria(c);
			}
			// Bloco catch
			catch (EntradaZeroException e) {
				cont--;
				System.out.println(e.getMessage());
			}
			/*
			 * Condi��o para o vetor receber ou n�o o valor recebido de System.in
			 */
			if (c != 0)
				user00.getCalVet()[cont] = c;
			// Contador usado para o n�mero de dias e sa�da do loop
			cont++;
		} while (cont < user00.getCalVet().length);
		input.close();

		System.out.println("Semana computada com sucesso");
		Imc.imcAtual(user00.getPeso(), user00.getAltura());
		Imc.imcEstimado(user00.getPeso(), user00.getAltura(), user00.getCalVet());
	}
}
