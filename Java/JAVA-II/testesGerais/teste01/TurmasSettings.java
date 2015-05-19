package teste01;

public enum TurmasSettings
{
		MANHA1(8),
		MANHA2(10),
		TARDE1(15),
		TARDE2(17),
		NOITE1(19),
		SEGUNDA(002),
		TERCA(003),
		QUARTA(004),
		QUINTA(005),
		SEXTA(006),
		SABADO(007),
		DOMINGO(001),
		DURACAO1(1),
		DURACAO2(2),
		DURACAO3(3);
		
		//Construtor padrao para esse enumecao
		TurmasSettings(int start){}
		
		private int inicio;
		private int dia;
		private int duracao;
		
		//Encapsulamento
		public int getInicio()
		{
			return inicio;
		}
		public int getDia()
		{
			return dia;
		}
		public int getDuracao()
		{
			return duracao;
		}
}
