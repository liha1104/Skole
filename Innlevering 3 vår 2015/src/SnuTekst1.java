import java.util.Scanner;

public class SnuTekst1 {

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Kan du være så snill å skrive inn en setning som skal snues?");
		String userInput = in.nextLine();

		baklengs(userInput);
	}

	public static void baklengs(String tekst) {
		if (tekst.length() > 0) {
			System.out.print(tekst.charAt(tekst.length() - 1));
			baklengs(tekst.substring(0, tekst.length()-1));
		}
	}
}