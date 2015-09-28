package ch.zhaw.musteraufgabe.vererbung;

public class Verkehrsflugzeug extends Flugzeug{

	private int anzPassagiere;
	
	
	public Verkehrsflugzeug(String hersteller, int maxSpeed, int anzahlFluegel, String immatNummer) {
		super(hersteller, maxSpeed, anzahlFluegel, immatNummer);
		this.anzPassagiere = anzPassagiere;
		
	}
	
	@Override
	public boolean getLooping() {
		return false;
	}

	public int getAnzPassagiere() {
		return anzPassagiere;
	}

	public void setAnzPassagiere(int anzPassagiere) {
		this.anzPassagiere = anzPassagiere;
	}
	
	

}
