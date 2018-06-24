
public class SchlüsselwortIf {

	public static void main(String[] args) {
		
		// Kontrollstrukturen steuern den Programablaufplan
		
		// if = falls
		// else = ansonsten
		
		int score = 4000;
		
		if (score == 5000) {
			System.out.println("Herzlichen Glückwunsch, neuer Rekord!");
		} else {
			System.out.println("Schade dein Score reicht leider nicht!");
		}
		
		int lebenPlayer = 0;
		
		if (lebenPlayer == 0) {
			System.out.println("Spiel verloren");
		}
		
		boolean gegnerHit = true;
		int highscore = 0;
		
		if (gegnerHit) {
			System.out.println("Gegner getroffen!");
			highscore += 10;
			System.out.println("Highscore " + highscore);
		} else {
			System.out.println("Daneben");
		}

	}

}
