package com.booble.operacional;

public class Colaborador
{
	//propriedades privadas para preservacao dos dados e encapsulamento
	private int indiceVet;
	private String nome;
	private int matricula;
	private int idade;
	private String sexo;
	private int tipoDeContrato;
	private double cargaHoraria;

	//encapsulamento
	//metodos de acesso e modificacao das propriedades privadas
	public int getIndiceVet() {
		return indiceVet;
	}
	public void setIndiceVet(int indiceVet) {
		this.indiceVet = indiceVet;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String _nome){
		this.nome = _nome;
	}
	
	public int getMatricula(){
		return this.matricula;
	}
	public void setMatricula(int _matricula){
		this.matricula = _matricula;
	}
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int _idade){
		this.idade = _idade;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	public void setSexo(String _sexo){
		this.sexo = _sexo;
	}
	
	public int getTipoDeContrato(){
		return this.tipoDeContrato;
	}
	public void setTipoDeContrato(int _tipoDeTrabalho){
		this.tipoDeContrato = _tipoDeTrabalho;
	}
	
	public double getCargaHoraria(){
		return this.cargaHoraria;
	}
	public void setCargaHoraria(double _cargaHoraria){
		this.cargaHoraria = _cargaHoraria;
	}
}
