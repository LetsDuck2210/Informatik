package abi22.a2;

public class Schaltung {
	private Schalter[] schalter;
	private Bauteil ausgang;
	
	public Schaltung(Schalter[] schalter, Bauteil ausgang) {
		this.schalter = schalter;
		this.ausgang = ausgang;
	}
	
	public void wahrheitstafel() {
		var line0 = "";
		for(int i = 0; i < schalter.length; i++) {
			line0 += "S" + i + "\t";
		}
		ausgeben(line0 + "Ausgang");
		for(int i = 0; i < Math.pow(2, schalter.length); i++) {
			var line = "";
			for(int j = schalter.length - 1; j >= 0; j--) {
				boolean status = ((i >> j) & 1) == 1;
				schalter[j].setWert(status);
				line += status + "\t";
			}
			line += ausgang.getWert();
			ausgeben(line);
		}
	}
	
	private static void ausgeben(String text) {
		System.out.println(text);
	}
}
