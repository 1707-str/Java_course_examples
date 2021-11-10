package Ariphmetic_operations;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Starte Addition:");
		int arg1;
		int arg2;
		int sum;
		System.out.println("Bitte erstes Argument eingeben: ");
		arg1 = myInput.nextInt();
		System.out.println("Bitte zweites Argument eingeben: ");
		arg2 = myInput.nextInt();
		sum = arg1 + arg2;
		System.out.printf("Das Ergebnis ist: %d\n", sum);

	}

}
