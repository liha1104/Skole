import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class Ansatt extends Kort {

	public Ansatt(String forNavn, String etterNavn, int PIN) {
		super(forNavn, etterNavn, PIN);
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
}