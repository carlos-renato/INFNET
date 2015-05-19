
public class Main {

	public static void main(String[] args)
	{
		//lista para armazenar atletas
		Atleta[] atletas = new Atleta[5];
		
		//cadastrando modalidades
		Modalidade m01 = Modalidade.cadModalidade(0, "Futebol", 900);
		Modalidade m02 = Modalidade.cadModalidade(1, "Showbol", 500);
		Modalidade m03 = Modalidade.cadModalidade(2, "Volei", 300);
		Modalidade m04 = Modalidade.cadModalidade(3, "Natacao", 250);
		Modalidade m05 = Modalidade.cadModalidade(4, "Atletismo", 100);
		
		//cadastrando atletas
		atletas[0] = Atleta.cadAtleta(0, "Valderrama", 30, "m", 0, 10);
		atletas[1] = Atleta.cadAtleta(1, "Giba", 27, "m", 2, 8);
		atletas[2] = Atleta.cadAtleta(2, "Cesar Cielo", 25, "m", 3, 6);
		atletas[3] = Atleta.cadAtleta(3, "Claudinei Quirino", 35, "m", 4, 4);
		atletas[4] = Atleta.cadAtleta(4, "Marta", 33, "f", 1, 9);
		
		//imprimindo todos os atletas
		for(Atleta a: atletas)
		{
			System.out.println("Nome: "+a.getNome()+"| Idade: "+a.getIdade()+"| Sexo: "+a.getSexo()+"| Modalidade: "+a.getModalidade()+"| Fama: "+a.getFama());;
		}
		
		//imprimindo atleta mais famoso
		
	}


}
