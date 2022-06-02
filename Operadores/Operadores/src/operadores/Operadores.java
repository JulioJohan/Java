package operadores;

import java.util.Scanner;

public class Operadores {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float numero1,numero2,suma,resta,multi,divicion,resto ;
		
		System.out.println("Ingresa 2 numeros: ");
		numero1 = entrada.nextFloat();
		numero2 = entrada.nextFloat();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		multi = numero1 * numero2;
		divicion = numero1 / numero2;
		resto = numero1 % numero2;
	
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: " + resta);
		System.out.println("la multiplicacion es: " + multi);
		System.out.println("la division es: "+ divicion);
		System.out.println("el resto es: "+ resto);
		
		//Operadores con asignacion
		int numero = 10;
		
		numero -= 5;
		numero += 5;
		numero *= 5;
		//Operadores de incremento y decrementp
		
		
		int x = 5, y;
		
		y = x++;//5
		y = ++x;//6
		
		x++; //x += 1
		x--;
		
		
		
	}
}
