package org.generation.italy.geometria;

import java.util.Scanner;

public class Rettangolo {
	
	
	
	//attributi
	
	int base;
	int altezza;
	
	// costruttori
	
	Rettangolo (int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	
	}
	
	// metodo
	
	int calcolaArea() {
		int calcolaArea;
		return base * altezza;
	}
	int calcolaPerimetro() {
		int calcolaPerimetro;
		return (base * 2) + (altezza * 2);
	}
	
	
	
	}
   

