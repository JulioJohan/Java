import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		float numeros[] = new float[10];
		
		
		System.out.println("Guardando informacion del arreglo... ");
		for(int i = 0;i<10; i++) {
			System.out.print((i+ 1)+" Ingresa un numero ");
			numeros[i] = entrada.nextFloat();
		}
		
		System.out.println("El resultado es: ");
		for(int i = 0; i<5; i++) {
			System.out.println(numeros[i] + " ");//Primer elemento del arreglo
			System.out.println(numeros[9 -i] + "");//El ultimo elemento del arreglo
		}
		System.out.println();
		
//		for(float i: numeros) {
//			System.out.println("Primer Numero: " + numeros[0]);
//			System.out.println("Ultimo Numero: " + numeros[9]);
//			System.out.println("segundo Numero: " + numeros[1]);
//			System.out.println("penultimo Numero: " + numeros[8]);
//			System.out.println("tercer Numero: " + numeros[2]);
//			System.out.println("ante penultimo Numero: " + numeros[7]);
//			System.out.println("cuarto Numero: " + numeros[3]);
//			System.out.println("sexto Numero: " + numeros[5]);
//			System.out.println("quinto Numero: " + numeros[4]);
//
//			
//		}
		
		
		
	}
}
