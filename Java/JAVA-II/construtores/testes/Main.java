package testes;

public class Main
{
	public static void main(String[] args)
	{
		//Carro carroDefault = new Carro();
		Carro ford = new Carro("Prata", false, 200);
		Carro chevrolet = new Carro("Agile", "Branco", true, 4);
		Carro toyota = new Carro("Corolla", 300);
				
		System.out.println("\n--------------Carro 1-------------\n");
		System.out.println("Montadora: "+ford.getMontadora());
		System.out.println("Nome: "+ford.getNome());
		System.out.println("Cor: "+ford.getCor());
		ford.configCambio(ford.getAutomatico());
		System.out.println("Câmbio: "+ford.getCambio());
		System.out.println("Velocidade Máxima: "+ford.getVelocidade()+"km/h");
		System.out.println("Portas: "+ford.getPortas());
		
		System.out.println("\n------------Carro 2-------------\n");
		System.out.println("Montadora: "+chevrolet.getMontadora());
		System.out.println("Nome: "+chevrolet.getNome());
		System.out.println("Cor: "+chevrolet.getCor());
		chevrolet.configCambio(chevrolet.getAutomatico());
		System.out.println("Câmbio: "+chevrolet.getCambio());
		System.out.println("Velocidade Máxima: "+chevrolet.getVelocidade()+"km/h");
		System.out.println("Portas: "+chevrolet.getPortas());
		
		System.out.println("\n------------Carro 3-------------\n");
		System.out.println("Montadora: "+toyota.getMontadora());
		System.out.println("Nome: "+toyota.getNome());
		System.out.println("Cor: "+toyota.getCor());
		toyota.configCambio(toyota.getAutomatico());
		System.out.println("Câmbio: "+toyota.getCambio());
		System.out.println("Velocidade Máxima: "+toyota.getVelocidade()+"km/h");
		System.out.println("Portas: "+toyota.getPortas());
	}

}
