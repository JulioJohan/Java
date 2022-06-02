import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		double[] numeros = new double[5];
		
		
		
		System.out.println("Guardando numeros");
		for(int i = 0; i < 5; i++) {
			System.out.print("Ingresa un numero: ");
			numeros[i] = entrada.nextDouble();
		}
		
		System.out.println("Los elementos del arreglo en ordern inverso: ");
	
		//inicia en 4 que es igual a 5 y i>= 0 es cuando se detienet por eso es i--- 
		for(int i=4; i>=0; i--) {
			System.out.println("numeros" + numeros[i]);
		}

		
		
	}
}
