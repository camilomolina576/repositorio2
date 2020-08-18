package me.Camilo.tutorial;

import java.util.Scanner;

public class Restaurante {
	public static void main(String[] args) {
		int[] choices;
		int tipo = 0;
		int meal = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Que tipo de comida quieres (1. Vegetaraniana, 2. No Vegetariana, 3. Rapida)");
		tipo = input.nextInt();
		
		switch(tipo){
		case 1:
			System.out.println("1.Sopa, 2.Ensalada, 3.Jugo");
			break;
		}
		
		System.out.println("Que quieres comer: ");
		meal = input.nextInt();
		System.out.println(foodSelection(meal));
		
		input.close();
		
	}
	
	private static double foodSelection(int selection) {
		int soupPrice = 10000, saladPrice = 25000, juicePrice = 5000;
		double total;
		
		switch(selection) {
		case 1:
			return soupPrice * 1.19;
		case 2:
			return saladPrice * 1.19;
		case 3:
			return juicePrice * 1.19;
		}
		
		return 0;
	}
	
	
}
