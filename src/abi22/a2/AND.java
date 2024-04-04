package abi22.a2;

public class AND extends Gatter {

	public AND(Bauteil eingang0, Bauteil eingang1) {
		super(2);
		super.eingang[0] = eingang0;
		super.eingang[1] = eingang1;
	}

	@Override
	public boolean getWert() {
		return eingang[0].getWert() && eingang[1].getWert();
	}

	@Override
	public int getSchaltzeit() {
		return 135;
	}

}
