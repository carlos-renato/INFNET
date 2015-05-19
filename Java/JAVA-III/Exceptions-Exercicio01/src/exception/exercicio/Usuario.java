package exception.exercicio;

public class Usuario {
	/* Variaveis de instancia */
	private String nomeCompleto;
	private int idade;
	private double altura;
	private double peso;
	private double[] calVet = new double[7];

	/* Construtor */
	/**
	 * @param nomeCompleto
	 * @param idade
	 * @param altura
	 * @param peso
	 * @param calVet
	 */
	public Usuario(String nomeCompleto, int idade, double altura, double peso) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.calVet = calVet;
	}


	// Getters e Setters
	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public double[] getCalVet() {
		return calVet;
	}

	public void setCalVet(double[] calVet) {
		this.calVet = calVet;
	}

}
