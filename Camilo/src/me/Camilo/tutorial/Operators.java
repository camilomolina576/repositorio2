package me.Camilo.tutorial;

public class Operators {
	public static String username;
	
	public int addition(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return b / a;
	}
	
	public double log(int a, int b) {
		return Math.log(a);
	}
	
	public double pow(int a, int b) {
		return Math.pow(a, b);
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
