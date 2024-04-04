package main;

import abi22.a2.AND;
import abi22.a2.NOT;
import abi22.a2.OR;
import abi22.a2.Schalter;
import abi22.a2.Schaltung;

public class Main {

	public static void main(String[] args) {
		var schalter = new Schalter[] {
			new Schalter(),
			new Schalter(),
			new Schalter()
		};
		var a1 = new AND(schalter[0], schalter[1]);
		var n1 = new NOT(schalter[2]);
		var o1 = new OR(a1, n1);
		var a2 = new AND(schalter[0], o1);
		var ausgang = new OR(schalter[1], a2);
		
		var schaltung = new Schaltung(schalter, ausgang);
		schaltung.wahrheitstafel();
	}

}
