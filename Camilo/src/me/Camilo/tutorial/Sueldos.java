package me.Camilo.tutorial;

import java.util.Scanner;

public class Sueldos {
	public static void main(String[] args) {
		double salary = 0;
		int nVendedores = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Whats the salary of the worker:  ");
		salary = input.nextDouble();
		System.out.println("How many sales: ");
		nVendedores = input.nextInt();
		
		System.out.println("The total salary is: " + totalSalary(salary, nVendedores));
		input.close();
	}
	
	public static double totalSalary(double salary, int nVendedores) {
		return salary + (nVendedores * 0.1);
		}
}
