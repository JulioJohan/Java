package ejercicio1;

import java.util.Scanner;

public class ejercicio {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		float cal1,cal2,cal3,total;
		
		//Guardando las notas
		System.out.println("Ingresa la primera calificacion: ");
		cal1 = entrada.nextFloat();
		System.out.println("Ingresa la segunda calificacion: ");
		cal2 = entrada.nextFloat();
		System.out.println("Ingresa la tercera calificacion: ");
		cal3 = entrada.nextFloat();
		
		total = cal1 + cal2 + cal3;
		
		System.out.println("\n Suma de las tres calificaciones" +total);
		
		
	}
}
