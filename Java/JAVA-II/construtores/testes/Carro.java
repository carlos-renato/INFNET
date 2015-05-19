package testes;

public class Carro
{
	//propriedades protegidas para encapsulamento
	private String montadora;
	private String nome;
	private String cor;
	private Boolean automatico;
	private String cambio;
	private int portas;
	private int velocidade;
	
	/*Construtor Padrao*/
	public Carro()
	{
	}
	
	/*Meu construtor 01
	 *Carro Padrao 01
	 *Ford, Novo KA, 4 portas* 
	 */
	public Carro(String cor, Boolean automatico, int velocidade)
	{
		setMontadora("Ford");
		setNome("Novo KA");
		setCor(cor);
		setAutomatico(automatico);
		setPortas(4);
		setVelocidade(velocidade);
	}
	
	/*Meu construtor 02
	 * Carro Padrao 01
	 * Chevrolet, 250kph,  
	 */
	public Carro(String nome, String cor, Boolean automatico, int portas)
	{
		setMontadora("Chevrolet");
		setNome(nome);
		setCor(cor);
		setAutomatico(automatico);
		setPortas(portas);
		setVelocidade(250);
	}

	/* Meu construtor 03
	 * Carro padrao 03
	 * Toyota, prata, automatico, 4 portas
	 */
	public Carro(String nome, int velocidade)
	{
		setMontadora("Toyota");
		setNome(nome);
		setCor("Prata");
		setAutomatico(true);
		setPortas(4);
		setVelocidade(velocidade);
	}
	
	//metodos de acesso e configuracao das propriedades
	public String getMontadora() {
		return montadora;
	}
	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getAutomatico() {
		return automatico;
	}
	public void setAutomatico(Boolean automatico) {
		this.automatico = automatico;
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	//metodo para configurar o cambio (manual/automatico)
	public Boolean configCambio(Boolean automatico)
	{
		if (automatico == true)
			setCambio("Automatico");
		else
			setCambio("Manual");
		return automatico;
	}
}
