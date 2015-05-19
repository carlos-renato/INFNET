
public class Atleta
{
	//propriedades privadas para cumprir as regras de encapsulamento
	private String nome;
	private int idade;
	private String sexo;
	private int modalidade;
	private int fama;
	private int indice;
	
	//metodo para realizar o cadastro de atletas
	public static Atleta cadAtleta(int indice, String _nome, int _idade, String _sexo, int _modalidade, int _fama){
		Atleta a = new Atleta();
		
		a.setNome(_nome);
		a.setIdade(_idade);
		a.setSexo(_sexo);
		a.setModalidade(_modalidade);
		a.setFama(_fama);
		
		return a;
	}
	
	//metodos para acessar e  modificar as propriedades privadas desta classe
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getModalidade() {
		return modalidade;
	}
	public void setModalidade(int modalidade) {
		this.modalidade = modalidade;
	}
	public int getFama() {
		return fama;
	}
	public void setFama(int fama) {
		this.fama = fama;
	}



	public int getIndice() {
		return indice;
	}
}
