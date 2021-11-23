package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
	
		System.out.print("Base: ");
		int base = scan.nextInt();
		System.out.print("Altezza: ");
		int altezza = scan.nextInt();
	
		Rettangolo rett1 = new Rettangolo(base, altezza);
		
		
		
	
		
		System.out.println("Area: " + rett1.calcolaArea());
		System.out.println("Perimetro: " + rett1.calcolaPerimetro());
		
		
		
	
		scan.close();

	}

}
