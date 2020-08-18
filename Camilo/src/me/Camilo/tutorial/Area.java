package me.Camilo.tutorial;

public class Area {
	public static void main(String[] args) {
		System.out.println("the area is: " + getArea(5));
	}
	
	public static double getArea(double r) {
		return Math.PI * r / 4 * Math.pow(r, 2);
	}
}
