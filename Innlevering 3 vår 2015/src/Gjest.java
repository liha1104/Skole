import java.util.GregorianCalendar;

public class Gjest extends Kort {

	private GregorianCalendar utløpsDato;

	public Gjest(String forNavn, String etterNavn) {
		super(forNavn, etterNavn, 9999);
		GregorianCalendar dato = new GregorianCalendar();
		dato.add(GregorianCalendar.DAY_OF_MONTH, 7);
		utløpsDato = (GregorianCalendar) dato.clone();
		dato = null;
	}

	public boolean sjekkPIN(int pin) {
		GregorianCalendar dato = new GregorianCalendar();

		if (utløpsDato.compareTo(dato) <= 0)
			endreSperret();

		if (!this.getSperret() && pin == 9999) {
			return true;

		} else
			return false;
	}
	
	public Object clone() {
		Gjest klone = (Gjest) super.clone();
		klone.utløpsDato = (GregorianCalendar) this.utløpsDato.clone();

		return klone;
	}
}