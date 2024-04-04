package abi22.a2;

public class Schalter extends Bauteil {
	private boolean wert;
	public boolean getWert() {
		return wert;
	}
	public void setWert(boolean wert) {
		this.wert = wert;
	}
	@Override
	public int getSchaltzeit() {
		return 0;
	}
	
}
