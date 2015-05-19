package teste01;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno
{
	private String fulName;
	private int diaNasc;
	private int mesNasc;
	private int anoNasc;
	private String endereco;
	private int telefone1;
	private int telefone2;
	
	//Encapsulamento
	public String getFulName() {
		return fulName;
	}
	public void setFulName(String fulName) {
		this.fulName = fulName;
	}
	public int getDiaNasc() {
		return diaNasc;
	}
	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	public int getMesNasc() {
		return mesNasc;
	}
	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}
	public int getAnoNasc() {
		return anoNasc;
	}
	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}
	public int getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}

	public static void cadAluno()
	{
		ArrayList<Aluno> lista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		boolean continua = true;
		Aluno a = new Aluno();
		int cont = 1;//variável usada para contar os índices do Arraylist
		
		while(continua)
		{
		System.out.println("Entre com o nome completo do Aluno: ");
		cont++;
		continua = false;
		
		}
		
	}
	
}
