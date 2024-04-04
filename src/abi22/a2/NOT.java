package abi22.a2;

public class NOT extends Gatter {

	public NOT(Bauteil eingang) {
		super(1);
		super.eingang[0] = eingang;
	}

	@Override
	public boolean getWert() {
		return !eingang[0].getWert();
	}

	@Override
	public int getSchaltzeit() {
		return 80;
	}

}
