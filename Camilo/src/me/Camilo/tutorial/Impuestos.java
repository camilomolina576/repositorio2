package me.Camilo.tutorial;

import java.util.Scanner;

public class Impuestos {
	public static void main(String[] args) {
		int type = 0;
		double truckCost, carCost;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type of Vehicle (Car is 2 or Truck is 1)");
		type = input.nextInt();
		
		switch(type) {
		case 1:
			System.out.println("How much is the Truck price?");
			truckCost = input.nextDouble();
			System.out.println("The taxes are: " + taxesTruck(truckCost));
			break;
		case 2:
			System.out.println("How much is the car cost: ");
			carCost = input.nextDouble();
			System.out.println("The taxes are: " + taxesCar(carCost));
			break;
		}
		
		input.close();
	}

	private static double taxesTruck(double price) {
		if(price <= 80) {
			return 0;
		}
		
		if (price > 80) {
			return price / 2;
		}
		
		return 0;
	}
	
	private static double taxesCar(double price) {
		if(price < 20) {
			return 5;
		}
		
		if(20 > price && price < 40) {
			return price * 0.20;
		}
		
		if(price > 40) {
			return 9;
			
		}
		return 0;	
	}
}
