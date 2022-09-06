package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int tall = Integer.parseInt(showInputDialog("Skriv et tall: "));
		int summ = 1;

		if (tall > 0) {
			for (int sum = 1; sum <= tall; sum++) {
				summ *= sum;
			}

		} else if (tall < 0) {
			System.out.print("Prøv på nytt");
		}

		System.out.print(summ);
	}
}
