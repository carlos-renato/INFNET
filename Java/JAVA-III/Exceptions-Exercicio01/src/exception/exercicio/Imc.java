package exception.exercicio;

public class Imc {
	public static void imcAtual(double peso, double altura) {
		float imc = (float) (peso / (altura * altura));
		System.out.println("Peso inicial: "+peso);
		System.out.printf("IMC inicial: %.2f kg/m2 - ", imc);
		System.out.print("Classificacao: ");

		if (imc < 16)
			System.out.println("Magreza grave.");
			if ((imc >= 16) && (imc < 17))
				System.out.println("Magreza moderada.");
				if ((imc >= 17) && (imc < 18.5))
					System.out.println("Magreza leve.");
					if ((imc >= 18.5) && (imc < 25))
						System.out.println("Saudavel.");
						if ((imc >= 25) && (imc < 30))
							System.out.println("Sobrepeso.");
							if ((imc >= 30) && (imc < 35))
								System.out.println("Obesidade Grau I.");
								if ((imc >= 35) && (imc < 40))
									System.out.println("Obesidade Grau II.");
									if (imc >= 40)
										System.out.println("Obesidade Grau III.");

	}

	public static void imcEstimado(double peso, double altura, double[] calorias) {

		double somaCalorias = 0;
		// Armazenando o total de calorias apos 7 dias.
		for (double c : calorias) {
			somaCalorias += c;
		}
		/*
		 * Peso estimado apos 7 dias
		 * Convertendo calorias em quilos
		 * Considerando 8000 kcal == 1000g.
		 */
		peso = (peso + ((somaCalorias/8)/1000));

		// Calculando IMC estimado apos 7 dias
		float imc = (float) (peso / (altura * altura));
		System.out.println("--------------------------------------------------------------");
		System.out.println("Peso estimado: "+peso);
		System.out.printf("IMC estimado: %.2f kg/m2 - ", imc);
		System.out.print("Classificacao: ");

		//
		if (imc < 16)
			System.out.println("Magreza grave.");
			if ((imc >= 16) && (imc < 17))
				System.out.println("Magreza moderada.");
				if ((imc >= 17) && (imc < 18.5))
					System.out.println("Magreza leve.");
					if ((imc >= 18.5) && (imc < 25))
						System.out.println("Saudavel.");
						if ((imc >= 25) && (imc < 30))
							System.out.println("Sobrepeso.");
							if ((imc >= 30) && (imc < 35))
								System.out.println("Obesidade Grau I.");
								if ((imc >= 35) && (imc < 40))
									System.out.println("Obesidade Grau II.");
									if (imc >= 40)
										System.out.println("Obesidade Grau III.");

	}
}
