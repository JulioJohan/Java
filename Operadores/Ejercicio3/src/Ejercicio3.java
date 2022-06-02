import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		float guillermo,luis,juan,total;
		
		System.out.println("Ingresa la cantidad de guillermo: ");
		guillermo = entrada.nextFloat();
		
		luis = guillermo / 2;
		juan = (luis + guillermo) /2 ;
		
		total = guillermo + luis + juan;
		
		System.out.println("La cantidad de dinero: " + total);
	
		
	}
}
