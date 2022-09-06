package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int karakter;
		String Bokstavkarakter = null;

		for (int i = 1; i <= 10; i++) {

			karakter = Integer.parseInt(showInputDialog("Din sumtall: "));

			if ((karakter < 0 || karakter > 100)) {
				i--;
				Bokstavkarakter = "Ugyldig karakter, skriv en ny sum";

			} else if (karakter >= 0 && karakter <= 39) {
				Bokstavkarakter = "F";
			} else if (karakter >= 40 && karakter <= 49) {
				Bokstavkarakter = "E";
			} else if (karakter >= 50 && karakter <= 59) {
				Bokstavkarakter = "D";
			} else if (karakter >= 60 && karakter <= 79) {
				Bokstavkarakter = "C";
			} else if (karakter >= 80 && karakter <= 89) {
				Bokstavkarakter = "B";
			} else if (karakter >= 90 && karakter <= 100) {
				Bokstavkarakter = "A";

			}
			System.out.println(Bokstavkarakter);

		}
	}
}
