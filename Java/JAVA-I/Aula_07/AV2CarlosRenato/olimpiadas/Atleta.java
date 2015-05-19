package olimpiadas;

public class Atleta
{
	private String nome;
	private int idade;
	private int fama;
	private char sexo;
	
	private Modalidades mod; // novo objeto - método construtor
	
	public static Atleta CadastrarAtleta(String nome, char sexo, int idade, int fama, Modalidades mod) //static para chamar sem instanciar,
	{
		Atleta a = new Atleta(); // criando e instanciando um novo atleta
		a.setNome(nome);
		a.setIdade(idade);
		a.setSexo(sexo);
		a.setFama(fama);
		a.setMod(mod);		
		return a; //retornando atleta
	}
	
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public int getIdade()
	{
		return idade;
	}

	public void setIdade(int idade)
	{
		this.idade = idade;
	}

	public int getFama()
	{
		return fama;
	}

	public void setFama(int fama)
	{
		this.fama = fama;
	}

	public char getSexo()
	{
		return sexo;
	}

	public void setSexo(char sexo)
	{
		this.sexo = sexo;
	}

	public Modalidades getMod()
	{
		return mod;
	}

	public void setMod(Modalidades mod)
	{
		this.mod = mod;
	}
	
	
}
