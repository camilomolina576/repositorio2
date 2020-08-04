package me.Camilo.tutorial;

public class Ejercicio10 {
	public double getFullConeArea(double radius, int height) {
		return (Math.PI * Math.pow(radius, 2)) * height;
	}
	
	public double getOtherConeArea(double radius, double missingHeight) {
		return (Math.PI * Math.pow(radius, 2)) * missingHeight;
	}
}
