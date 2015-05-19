package vetores;

public class exemploTimes {

	public static void main(String[] args) {
		
		
		
		String[] times = {"Botafogo", "Fluminense", "Flamengo", "Vasco"};
		for (String time : times)
		{
		if(time.equals("Fluminense")) continue;
		System.out.println(time);
		}

	}

}
