package vetores;

public class foraTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] times = {"Botafogo", "Fluminense", "Flamengo", "Vasco"};
		fora:
		for (String time1 : times) {
			for (String time2 : times) {
				if(time2.equals("Fluminense")) continue fora;
					System.out.println(time2);
			}
		}

	}

}
