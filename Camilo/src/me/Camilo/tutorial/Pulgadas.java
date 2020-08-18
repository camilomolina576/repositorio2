package me.Camilo.tutorial;

import java.util.Scanner;

public class Pulgadas {
	static double P = 0.0833;
	static double C = 2.54;
	static double L = 190080.02;
	static double Y = 36;
	static double measurement = 0;
	static String unit;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please write the measurement (36): ");
		measurement = input.nextDouble();
		System.out.println("Please write the unit (P, C, L, Y): ");
		unit = input.next();
		
		stuff(unit);
	}
	
	private static void stuff(String unit) {
		switch(unit) {
		case "P":
			System.out.println("Result: " + measurement * P);
			break;
		case "C":
			System.out.println("Result: " + measurement * C);
			break;
		case "L":
			System.out.println("Result: " + measurement * L);
			break;
		case "Y":
			System.out.println("Result: " + measurement * Y);
			break;
		}
	}
}
