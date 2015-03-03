public interface Fast {

	static final double FAKTOR = 1.25;

	public String getForNavn();

	public void setForNavn(String forNavn);

	public String getEtterNavn();

	public void setEtterNavn(String etterNavn);

	public String getNavn();

	public void setNavn(String navn);

	public double regnKreditt();

	public double regnBonus();
}