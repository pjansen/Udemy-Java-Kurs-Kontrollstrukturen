
public class SchleifeWhile {

	public static void main(String[] args) {
		
		// while = solange
		
		/*
		 * Allgemeiner Aufbau einer while-Schleife
		 * 
		 * 	while(Bedingung)
		 *  {
		 *  }
		 *  
		 *  Merke: Bedingung kann entweder true oder falls sein
		 */
		
		int count = 1;
//		while (count != 6) {
//			System.out.println("Ich bin: " + count);
//			count++;
//		}
		
		while (true) {
			System.out.println("Hi");
			if (count == 3) {
				break;
			} else {
				count++;
			}
		}

	}

}
