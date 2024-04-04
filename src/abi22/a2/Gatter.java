package abi22.a2;

// Jedes Gatter geht mit den Eingängen unterschiedlich um
public abstract class Gatter extends Bauteil {
	protected Bauteil[] eingang;
	
	public Gatter(int anzahlEingaenge) {
		eingang = new Bauteil[anzahlEingaenge];
	}
}
