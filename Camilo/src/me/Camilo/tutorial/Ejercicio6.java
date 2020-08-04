package me.Camilo.tutorial;

public class Ejercicio6 {
	public double areaDePolygono(double n, double s) {
		return ((n * Math.pow(s, 2)) / (4 * Math.tan((Math.PI)/n)));
	}
}
