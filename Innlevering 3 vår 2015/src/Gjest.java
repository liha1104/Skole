import java.util.GregorianCalendar;

public class Gjest extends Kort {

	private GregorianCalendar utl�psDato;

	public Gjest(String forNavn, String etterNavn) {
		super(forNavn, etterNavn, 9999);
		GregorianCalendar dato = new GregorianCalendar();
		dato.add(GregorianCalendar.DAY_OF_MONTH, 7);
		utl�psDato = (GregorianCalendar) dato.clone();
		dato = null;
	}

	public boolean sjekkPIN(int pin) {
		GregorianCalendar dato = new GregorianCalendar();

		if (utl�psDato.compareTo(dato) <= 0)
			endreSperret();

		if (!this.getSperret() && pin == 9999) {
			return true;

		} else
			return false;
	}
	
	public Object clone() {
		Gjest klone = (Gjest) super.clone();
		klone.utl�psDato = (GregorianCalendar) this.utl�psDato.clone();

		return klone;
	}
}