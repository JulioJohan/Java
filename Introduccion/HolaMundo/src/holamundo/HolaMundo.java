package holamundo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class HolaMundo {
	public static void main(String[] args) {
		System.out.println("Hola Mundo"); //esto es un hola mundo
		System.out.println("Curso Java");
		//Comentario
		/*Comentario
		 * para multiples linea*/
		//Tipos de datos primitivos
		//entero
		int entero = 12;
		//decimal
		float fl = 12.3f;
		//decimal 64bits
		double decimal = 12.21;
		//Caracter
		char caracter = 'a';
		//true false
		boolean decision = true; 
		System.out.println("Caracter :" + caracter);
		//Datos no primitivos
		//null no almacena nada
		Integer numero = null;
		//Constante 
		final int n = 10;
		
		
		String palabra = "Hola";
		
		System.out.println(palabra);
		
		//Entrada de datos
		Scanner entrada = new Scanner(System.in);
		float num;
		System.out.println("Digite un numero: ");
		num = entrada.nextFloat();
		
		System.out.println("El numero es: " + numero);
		
		String cadena;
		
		System.out.println("Digite una cadena");
		cadena = entrada.nextLine();
		
		System.out.println("La cadena es" + cadena);
		
		
	}
}
