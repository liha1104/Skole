import java.util.Scanner;

public class TowerOfHanoi {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();

		System.out.println("Trekkene er:");
		flyttDisker(n, 'A', 'B', 'C');
	}

	public static void flyttDisker(int n, char fraT�rn, char p�T�rn,
			char gjennomT�rn) {
		if (n == 1) {
			System.out.printf(
					"Flytt skiven %2d fra %c til %c\n",
					n, fraT�rn, p�T�rn);
		} else {
			flyttDisker(n - 1, fraT�rn, gjennomT�rn, p�T�rn);
			System.out.printf(
					"Flytt skiven %2d fra %c til %c\n",
					n, fraT�rn, p�T�rn);
			flyttDisker(n - 1, gjennomT�rn, p�T�rn, fraT�rn);
		}
	}
}