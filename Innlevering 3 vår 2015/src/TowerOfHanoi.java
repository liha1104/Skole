import java.util.Scanner;

public class TowerOfHanoi {

	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Skriv inn antall skiver: ");
		int n = input.nextInt();

		System.out.println("Trekkene er:");
		flyttDisker(n, 'A', 'B', 'C');
	}

	public static void flyttDisker(int n, char fraTårn, char påTårn,
			char gjennomTårn) {
		if (n == 1) {
			System.out.printf(
					"Flytt skiven %2d fra %c til %c\n",
					n, fraTårn, påTårn);
		} else {
			flyttDisker(n - 1, fraTårn, gjennomTårn, påTårn);
			System.out.printf(
					"Flytt skiven %2d fra %c til %c\n",
					n, fraTårn, påTårn);
			flyttDisker(n - 1, gjennomTårn, påTårn, fraTårn);
		}
	}
}