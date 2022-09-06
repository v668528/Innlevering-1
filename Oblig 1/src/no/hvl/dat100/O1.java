package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int lønn = Integer.parseInt(showInputDialog("Skriv her din bruttolønn: "));
		int trinn;
		double skatt;

		if (lønn >= 190350 && lønn <= 267899) {

			skatt = (int) (lønn * 0.17);
			trinn = 1;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);

		} else if (lønn >= 267900 && lønn <= 643799) {

			skatt = (int) (lønn * 0.04);
			trinn = 2;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);

		} else if (lønn >= 643800 && lønn <= 969199) {

			skatt = (int) (lønn * 0.134);
			trinn = 3;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);

		} else if (lønn >= 969200 && lønn <= 1999999) {

			skatt = (int) (lønn * 0.164);
			trinn = 4;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);

		} else if (lønn >= 2000000) {

			skatt = (int) (lønn * 0.174);
			trinn = 5;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);

		} else if (lønn < 190350) {

			skatt = 0;
			trinn = 0;
			System.out.println("Trinn: " + trinn);
			System.out.print("TrinnSkatt: " + skatt);
		}

	}

}
