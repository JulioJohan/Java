package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		double a,b,c;
		
		System.out.println("Ingresa el numero: ");
		a = entrada.nextDouble();
		
		System.out.println("Ingresa la potencia: ");
		b = entrada.nextDouble();
		
		c = Math.pow(a,2) + Math.pow(b, 2) + (2*a*b);
		
		System.out.println("Total" + c);
		
		
		
		
		
		
		
	}
}
