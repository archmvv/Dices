
public class Dices {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++ ) 
		{
			// Generate random numbers from 1 to 6
			
			int d1 = (int) ((Math.random() * 6) + 1);
			int d2 = (int) ((Math.random() * 6) + 1);
			
			System.out.println(d1 + " " + d2);
		}

	}

}
