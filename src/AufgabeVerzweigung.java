import java.util.Scanner;

public class AufgabeVerzweigung {

	public static void main(String[] args) {

		System.out.println("Wieviele Bundeländer hat Deutschland?");
		System.out.println("15, 3, 16 oder 30");
		
		Scanner scanner = new Scanner(System.in);
		int eingabeUser = scanner.nextInt();
		
		if (eingabeUser == 16) {
			System.out.println("Das ist richtig!");
		} else {
			System.out.println("Das ist falsch");
		}
		

	}

}
