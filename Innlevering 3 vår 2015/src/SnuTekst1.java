import java.util.Scanner;

public class SnuTekst1 {

	private static Scanner in = new Scanner(System.in);

	private static int antall = 0;

	public static void main(String[] args) {
		System.out
				.println("Kan du være så snill å skrive inn en setning som skal snues?");
		String tekst = in.nextLine();

		baklengs(tekst);
	}

	public static void baklengs(String tekst) {
		baklengs(tekst, tekst.length() - 1);
	}
	
	public static void baklengs(String tekst, int index) {
		if (index >= 0) {
			System.out.print(tekst.charAt(index));
			antall++;
			baklengs(tekst, index - 1);
		} else {
			System.out.println("\nDet er totalt " + antall + " tegn i tekststrengen.");
			antall = 0;
		}
	}
}