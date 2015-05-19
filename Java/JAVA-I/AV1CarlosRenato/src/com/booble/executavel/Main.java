package com.booble.executavel;
import com.booble.adm.RH;
import com.booble.operacional.FolhaDePagamento;



public class Main {
	public static void main(String[] args) {
		
		FolhaDePagamento folha = new FolhaDePagamento();
		//Criando colaboradores
		folha.cadstrarColaborador(0, "Pedro Augusto", 001, 30, "m", 1, 5);
		folha.cadstrarColaborador(1, "Marta Souza", 002, 25, "f", 2, 30.5);
		folha.cadstrarColaborador(2, "Bruno Castro", 003, 17, "m", 3, 100);
		
		RH.exibirStatus(folha);
		
		
	}

}
