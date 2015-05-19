package executavel;
import java.lang.reflect.Array;
import java.util.ArrayList;

import comum.Heroi;
import comum.herois.Batman;
import comum.herois.Superman;
import comum.herois.Wolverine;


public class Main {

	public static void main(String[] args) {
		ArrayList<Heroi> lista = new ArrayList<Heroi>();
		
		Heroi h1 = new Superman();
		Heroi h2 = new Batman();
		Heroi h3 = new Wolverine();

		lista.add(h1);
		lista.add(h2);
		lista.add(h3);
		
		for(Heroi h: lista){
			h.atacar();
		}
	}

}
