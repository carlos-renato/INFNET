package com.booble.operacional;

public class FolhaDePagamento
{
	//propriedades privadas para preservacao dos dados e encapsulamento
	private int ano;
	private int mes;
	private Colaborador[] listaColaboradores = new Colaborador[3];
	//propriedade publica para ser acessivel diretamente de outros pacotes
	//propriedade static para ser acessivel sem a necessidade de instancia
	public static int numeroDeSerie;


	//metodo para cadastrar colaboradores
	public void cadstrarColaborador(int indiceVet, String nome, int matricula, int idade, String sexo,
			int _tipoDeContrato, double cargaHoraria) {

		Colaborador colaborador = new Colaborador();
		colaborador.setIndiceVet(indiceVet);
		colaborador.setNome(nome);
		colaborador.setMatricula(matricula);
		colaborador.setIdade(idade);
		colaborador.setSexo(sexo);
		colaborador.setTipoDeContrato(_tipoDeContrato);
		colaborador.setCargaHoraria(cargaHoraria);
		
		this.listaColaboradores[indiceVet] = colaborador;
	
	}

	//encapsulamento
	//metodos de acesso e modificacao das propriedades privadas
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}

	public Colaborador[] getListaColaboradores() {
		return listaColaboradores;
	}

	public void setListaColaboradores(Colaborador[] listaColaboradores) {
		this.listaColaboradores = listaColaboradores;
	}


}
