package abi22.a2;

public class NAND extends NOT {

	public NAND(Bauteil eingang0, Bauteil eingang1) {
		super(new AND(eingang0, eingang1));
	}

}
