package com.booble.adm;

import com.booble.operacional.Colaborador;
import com.booble.operacional.FolhaDePagamento;

public class RH {
	public static void exibirStatus(FolhaDePagamento folha) {
		System.out.println("Iniciando Exibição do Status da Empresa\n");

		// imprimindo todos os funcionarios
		for (Colaborador c : folha.getListaColaboradores()) {
			System.out.println("Funcionario: " + c.getNome() + "\tSalario: R$"
					+ RH.determinarPagamento(c.getTipoDeContrato())
					* c.getCargaHoraria());
		}

		maiorSalario(folha);

		System.out.println("\nEncerrando Exibição do Status da Empresa");
	}

	// imprimindo funcionario com maior salario
	public static void maiorSalario(FolhaDePagamento folha) {
		// variavel que armazena a lista de colaboradores a ter seus salarios
		// verificados
		Colaborador[] colab = folha.getListaColaboradores();

		// variavel que armazenara o indice do colaborador com o maior salario
		int indiceColaborador = 0;
		double maiorSalario = (determinarPagamento(colab[0].getTipoDeContrato()) * (colab[0]
				.getCargaHoraria()));

		for (int i = 0; i < colab.length; i++) {
			if ((determinarPagamento(colab[i].getTipoDeContrato()) * (colab[i]
					.getCargaHoraria())) > maiorSalario) {
				maiorSalario = (determinarPagamento(colab[i]
						.getTipoDeContrato()) * (colab[i].getCargaHoraria()));
				indiceColaborador = i;
			}
		}
		System.out.println("Colaborador com o maior salario:  "
				+ colab[indiceColaborador].getNome());

	}

	// determina o valor da hora de trabalho de acordo com o tipo de contrado
	public static int determinarPagamento(int tipoDeContrato) {
		int valor = 0;

		switch (tipoDeContrato) {
		case 1:
			valor = 50;
			break;

		case 2:
			valor = 20;
			break;

		default:
			valor = 10;
		}

		return valor;
	}
}
