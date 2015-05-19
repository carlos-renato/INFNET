
public class Modalidade
{
	//propriedades privadas para cumprir as regras de encapsulamento
	private String nome;
	private double salario;
	private static Modalidade[] listaModalidades = new Modalidade[5];
	
	//metodo para cadastrar modalidades
	public static Modalidade cadModalidade(int indice, String _nome, double _salario){
		Modalidade m = new Modalidade();
		m.setNome(_nome);
		m.setSalario(_salario);
		
		return m;
	}

	
	
	//metodos para acessar e  modificar as propriedades privadas desta classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
