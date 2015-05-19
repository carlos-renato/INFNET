package olimpiadas;

public class Main
{

	public static void main(String[] args)
	{
		Modalidades[] modalidades = new Modalidades[5];
		modalidades[0] = Modalidades.CriarModalidades("Pião", 2);
		modalidades[1] = Modalidades.CriarModalidades("Peteca", 3);
		modalidades[2] = Modalidades.CriarModalidades("Bolinha de Sabão", 15);
		
		Atleta[] atletas = new Atleta[5];		
		atletas[0] = Atleta.CadastrarAtleta("The Rock", 'm', 40, 10000, modalidades[0]);
		atletas[1] = Atleta.CadastrarAtleta("Crazy Frog", 'g', 24, 2424, modalidades[1]);
		
		//System.out.print(atletas[0].getNome()+ " | " + atletas[0].getMod().getNome()+" | "+ atletas[0].getMod().getSalarioMedio());
	
		for(Atleta atl: atletas)
		{
			System.out.println(atl.getNome()+ "|"+atl.getMod().getNome()+ "|" + atl.getMod().getSalarioMedio());
			
			
		}
		
	}

}
