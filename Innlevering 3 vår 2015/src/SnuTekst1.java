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
		if (tekst.length() > 0) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			antall++;
			baklengs(tekst.substring(0, tekst.length() - 1));
		} else {
			System.out.println("Det er totalt" + antall + "i tekststrengen.");
			antall = 0;
		}
	}
}