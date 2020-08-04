package me.Camilo.tutorial;

public class Ejercicio8 {
	public double viajes(int numeroPasajeros) {
		double viajesNecessarios = 0;
		if(numeroPasajeros % 40 > 1) {
			viajesNecessarios = (numeroPasajeros / 40) + 1;
		}
		return (numeroPasajeros / 40);
	}
	
	public int incomeBusDriver(int numeroPasajeros) {
		return numeroPasajeros * 10000;
	}
	
	public int incomeProprietario(int numeroPasajeros) {
		return numeroPasajeros * 2000;
	}
	
}
