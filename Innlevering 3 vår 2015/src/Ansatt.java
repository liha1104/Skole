import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Ansatt extends Kort implements Fast{

	private GregorianCalendar tidAnsatt;

	private double timesBetalt;

	public Ansatt(String firstName, String lastName, int PIN, double hourlyPay) {
		super(firstName, lastName, PIN);
		this.tidAnsatt = new GregorianCalendar();
		this.timesBetalt = hourlyPay;
	}
	
	public boolean sjekkPIN(int pin) {
		GregorianCalendar sjekkTid = new GregorianCalendar();

		if (sjekkTid.get(GregorianCalendar.HOUR_OF_DAY) < 7
				|| sjekkTid.get(GregorianCalendar.HOUR_OF_DAY) > 16
				|| sjekkTid.get(GregorianCalendar.DAY_OF_WEEK) == 1
				|| sjekkTid.get(GregorianCalendar.DAY_OF_WEEK) == 7
				&& !this.getSperret()){
			if (pin == this.getPIN()) {
				return true;
			} else
				return false;
		}
		if (!this.getSperret()) {
			return true;

		} else
			return false;
	}
	
	public String getForNavn() {
		return super.getForNavn();
	}

	public void setForNavn(String forNavn) {
		super.setForNavn(forNavn);
	}

	public String getEtterNavn() {
		return super.getEtterNavn();
	}

	public void setEtterNavn(String etterNavn) {
		super.setEtterNavn(etterNavn);
	}

	public String getNavn() {
		return super.getNavn();
	}

	public void setNavn(String navn) {
		StringTokenizer token = new StringTokenizer(navn);
		super.setForNavn(token.nextToken());

		String etterNavn = null;
		while (token.hasMoreTokens())
			etterNavn = token.nextToken();

		super.setEtterNavn(etterNavn);
	}

	public double regnKreditt() {
		return FAKTOR * timesBetalt;
	}

	public double regnBonus() {
		GregorianCalendar sjekkTid = new GregorianCalendar();
		int årAnsatt = sjekkTid.get(GregorianCalendar.YEAR)
				- tidAnsatt.get(GregorianCalendar.YEAR);

		return FAKTOR * årAnsatt;
	}
}