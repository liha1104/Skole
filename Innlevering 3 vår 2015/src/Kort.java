
public abstract class Kort {

	private static int kort;

	private String forNavn, etterNavn;

	private int PIN, kortNummer;

	private boolean sperret;

	public Kort(String firstName, String lastName, int PIN) {
		this.forNavn = firstName;
		this.etterNavn = lastName;
		this.PIN = PIN;
		kortNummer = ++kort;
	}

	public abstract boolean sjekkPIN(int pin);

	public String getNavn() {
		return forNavn + " " + etterNavn;
	}

	public boolean erSperret() {
		return sperret;
	}

	public void endreSperret() {
		sperret = !sperret;
	}

	public static int getKort() {
		return kort;
	}

	public String getForNavn() {
		return forNavn;
	}

	public void setForNavn(String forNavn) {
		this.forNavn = forNavn;
	}

	public String getEtterNavn() {
		return etterNavn;
	}

	public void setEtterNavn(String etterNavn) {
		this.etterNavn = etterNavn;
	}

	public int getPIN() {
		return PIN;
	}

	public int getKortNummer() {
		return kortNummer;
	}

	public static void setKort(int kortNummer) {
		kort = kortNummer;
	}

	public boolean getSperret() {
		return sperret;
	}

	public String toString() {
		return String.format(
				"Navn:\t\t%s\nPIN:\t\t%d\nKort nummer:\t%d\nEr sperret:\t%b\n",
				getNavn(), PIN, kortNummer, sperret);
	}
}