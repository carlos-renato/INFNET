package exception.divisionByZero;

import java.util.Scanner;

public class DivisionByZero {

	public static int divide(int a, int b) {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {

		int num1, num2;
		Scanner input = new Scanner(System.in);

		System.out.println("Entre com o 1o numero: ");
		num1 = input.nextInt();

		try {
			System.out.println("Entre com o 2o numero: ");
			num2 = input.nextInt();
			System.out.println("Resultado: " + divide(num1, num2));
		} catch (ArithmeticException ae) {
			System.out.println("ERRO: Divisao por zero");

		}
		input.close();
	}

}
