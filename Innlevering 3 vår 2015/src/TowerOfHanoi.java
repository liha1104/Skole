import java.util.Scanner;

public class TowerOfHanoi {

	private static Scanner input = new Scanner(System.in);
	private static int antall = 1, antallKall = 1;;
	
	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();

		System.out.println("Trekkene er:");
		flyttDisker(n, 'A', 'B', 'C');
		
		System.out.printf("\nAntall kall til metoden ble: %5d\n", antallKall);
	}

	public static void flyttDisker(int n, char fraT�rn, char p�T�rn,
			char gjennomT�rn) {
		if (n == 1) {
			System.out.printf(
					"Trekk nummer: %2d Flytt skiven %2d fra %c til %c\n",
					antall, n, fraT�rn, p�T�rn);
			antall++;
		} else {
			flyttDisker(n - 1, fraT�rn, gjennomT�rn, p�T�rn);
			System.out.printf(
					"Trekk nummer: %2d Flytt skiven %2d fra %c til %c\n",
					antall, n, fraT�rn, p�T�rn);
			antall++;
			flyttDisker(n - 1, gjennomT�rn, p�T�rn, fraT�rn);
		}
	}
}