package vetores;

public class arrayTeste {

	public static void main(String[] args) {
		
		String[][] names = {
	            {"Mr. ","Mrs. ","Ms. "},//primeira linha
	            {"Smith","Jones"}//segunda linha
	            };

	        // Mr. Smith
	        System.out.println(names[0][0] + names[1][0]);
	        // Ms. Jones
	        System.out.println(names[0][2] + names[1][1]);

	}

}
