package abi22.a2;

public class OR extends Gatter {

	public OR(Bauteil eingang0, Bauteil eingang1) {
		super(2);
		// Schalter gibt false zurück
		super.eingang[0] = eingang0 == null ? new Schalter() : eingang0;
		super.eingang[1] = eingang1 == null ? new Schalter() : eingang1;
	}

	@Override
	public boolean getWert() {
		return eingang[0].getWert() || eingang[1].getWert();
	}

	@Override
	public int getSchaltzeit() {
		return 135;
	}

}
