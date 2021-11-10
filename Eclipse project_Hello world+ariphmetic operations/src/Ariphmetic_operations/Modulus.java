package Ariphmetic_operations;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Starte Modulus");
		System.out.println("Bitte erstes Argument eingeben: ");
		int arg1 = myInput.nextInt();
		System.out.println("Bitte zweites Argument eingeben: ");
		int arg2 = myInput.nextInt();
		double remainder = arg1 % arg2;
		System.out.println("Das Ergebnis ist: ");
		System.out.println(remainder);
		System.out.println("Beende Modulus");

	}

}
