package me.Camilo.tutorial;

import java.util.Arrays;
import java.util.Scanner;

public class nuevos1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] inputValues = new int[20];
		
		int value = 1;
		
		System.out.println("Enter any amount of integers (enter 0 to stop): ");
		int i = 0;
		while(value != 0) {
			value = input.nextInt();
			inputValues[i] = value;
			System.out.println("Added: " + value + " to the array!");
			i++;
			
		}
		
		System.out.println(Arrays.toString(inputValues));
		
	}
	
	
	public double getCube(int number) {
		return Math.pow(number, 3);
	}
	
	public double getQuad(int number) {
		return Math.pow(number, 4);
	}
}
