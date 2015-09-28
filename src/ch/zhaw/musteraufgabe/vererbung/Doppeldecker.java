package ch.zhaw.musteraufgabe.vererbung;

public class Doppeldecker<LOOPINGSPEED> extends Flugzeug{
	
	private static final int LOOPINGSPEED = 320;
	private static final int ANZAHLFUEGEL = 2; 
	
	private boolean offenesCockpit;

	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer, boolean offenesCockpit) {
		super(hersteller, maxSpeed,ANZAHLFUEGEL, immatNummer);
	}
	
	public Doppeldecker(String hersteller, int maxSpeed, String immatNummer) {
		super(hersteller, maxSpeed,ANZAHLFUEGEL , immatNummer);
		offenesCockpit = true;
	}

	@Override
	public boolean getLooping() {
		if ( getMaxSpeed() > LOOPINGSPEED ){
			return true;
		}
		return false;
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return super.getMaxSpeed();
	}

	
}
