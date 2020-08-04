package me.Camilo.tutorial;

import java.util.Scanner;

public class Tut1 {
	static Scanner input = new Scanner(System.in);
	static int a, b;
	static int operator;
	
	public static void main(String[] args) {
		//Operators op = new Operators();
		
		//Ejercicio numero 1
		/*System.out.println("Please enter the value of a: ");
		a = input.nextInt();
		System.out.println("Please enter the value of b: ");
		b = input.nextInt();
		
		System.out.println("La suma es: " + op.addition(a, b));
		System.out.println("La resta es: " + op.subtract(a, b));
		System.out.println("La multiplicacion es: " + op.multiply(a, b));
		System.out.println("La division es: " + op.divide(a, b));
		System.out.println("The log of a is: " + op.log(a, b));
		System.out.println("The exponent is " + op.pow(a, b));*/
		
		//Ejecicio numero 2
		
		/*Ejercicio2 ej = new Ejercicio2();
		System.out.println("MPG: ");
		double MPG = input.nextDouble();
		System.out.println("El delta es: " + ej.LPK(MPG));*/
		
		//Ejercicio numero 3
		//2Math.PI*6371.07((()))
		/*long lat, lat2, lon, lon2, deltaLat, deltaLon;
		double degree, degree2, distance;
		
		System.out.println("Enter City 1 (First Latitude): ");
		lat = input.nextLong();
		System.out.println("Enter City 1 (Second Latitude): ");
		lat2 = input.nextLong();
		System.out.println("Enter City 2 (First Latitude): ");
		lon = input.nextLong();
		System.out.println("Enter City 2 (Second Latitude): ");
		lon2 = input.nextLong();
		
		deltaLat = lat2 - lat;
		deltaLon = lon2 - lon;
		
		System.out.println("Enter City 1 (Degree): ");
		degree = input.nextDouble();
		System.out.println("Enter City 2 (Degree): ");
		degree2 = input.nextDouble();
		
		distance = (2 * Math.PI) * (deltaLat * Math.sin(degree) + (deltaLon * Math.sin(degree2)))/ 360;
		System.out.println(distance);*/
		
		
		
		//result = 2 * Math.PI * distance * (((city1Lat1 -  city2Lat1) * (city1Lat2 - city2Lat2) * (city1Degree - city2Degree)) / 360);
		/*result = ((2 * Math.PI) * distance) * (Math.sin(city1Lat) * Math.sin(city2Lat1) + Math.cos(city1Lat) *  Math.cos(city2Lat2) * Math.cos(city2Lat1))/360;
		System.out.println("The stuff is: " + result);*/
		
		//Ejercicio 4
		/*double r = 0;
		Ejercicio4 ej4 = new Ejercicio4();
				
		System.out.println("Please enter the radius: ");
		r = input.nextDouble();
		
		System.out.println("The area is: " + ej4.getArea(r));
		System.out.println("The volume is: " + ej4.getVolume(r));*/
		
		
		//Ejercicio 5
		/*System.out.println("Please enter the mass: ");
		double mass = input.nextDouble();
		System.out.println("Please enter the change in temp: ");
		double deltaTemp = input.nextDouble();
		
		Ejercicio5 ej5 = new Ejercicio5();
		System.out.println("The amount of energy is: " + ej5.getCalories(mass, deltaTemp));*/
		
		//Ejercicio 6
		/*double s, n;
		System.out.println("Enter the value of S: ");
		s = input.nextDouble();
		System.out.println("Enter the value of N: ");
		n = input.nextDouble();
		
		Ejercicio6 ej6 = new Ejercicio6();		
		System.out.println("The result is: " + ej6.areaDePolygono(n, s));	*/
		
		//Ejercicio 7
		/*double kilosNeed;
		double maxWeight = 18000;
		double distance = 78.5;
		System.out.println("How many kilos you need moved: ");
		kilosNeed = input.nextDouble();
		
		Ejercicio7 ej7 = new Ejercicio7();
		System.out.println("The amount of days to move: " + kilosNeed + " kilos will take: " + ej7.getDays(kilosNeed) + " days and cost: " + ej7.getGasPrice(distance));
		*/
		
		//Ejercicio 8
		//Assumiendo 40 personas por bus.
		/*int numeroPasajeros = 0;
		int amountPerTraveler = 10000;
		int amountGivenToCompany = 2000;
		
		System.out.println("Cuantas personas quiera transportar: ");
		numeroPasajeros = input.nextInt();
		
		Ejercicio8 ej8 = new Ejercicio8();
		
		
		System.out.println("Viajes necessarios: " + ej8.viajes(numeroPasajeros));
		System.out.println("Dinero del driver: " + ej8.incomeBusDriver(numeroPasajeros));
		System.out.println("Dinero proprietqrio: " + ej8.incomeProprietario(numeroPasajeros));*/
		
		//Ejercicio 9
		//bus 60 puestos
		/*int gordos, flacos;
		System.out.println("Cuantos Gordos: ");
		gordos = input.nextInt();
		System.out.println("Cuantos Flacos: ");
		flacos = input.nextInt();
		
		Ejercicio9 ej9 = new Ejercicio9();
		
		
		System.out.println("Necessitan: " + ej9.numeroPaseo(gordos, flacos) + " buses.");*/
		
		//Ejercicio 10
		System.out.println("Please enter the height of the cone: ");
		int height = input.nextInt();
		System.out.println("Please enter the radius of the cone: ");
		double radius = input.nextDouble();
		System.out.println("Enter the missing height: ");
		int missingHeight = input.nextInt();
		
		
		Ejercicio10 ej10 = new Ejercicio10();
		System.out.println("The are of the full cone is: " + ej10.getFullConeArea(radius, height));
		System.out.println("The incomplete cone has an area of: " + ej10.getOtherConeArea(radius, missingHeight));
		input.close();
	}
}
