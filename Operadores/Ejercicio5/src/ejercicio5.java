import java.util.Scanner;

public class ejercicio5 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		float participacion,pEParcial,sEParcial,examenFinal,total;
		
		System.out.println("Ingresa la calificacion de la participacion: ");
		participacion = entrada.nextFloat();
		System.out.println("Ingresa la calificacion del primer examen: ");
		pEParcial = entrada.nextFloat();
		System.out.println("Ingresa la calificacion del segundo examen: ");
		sEParcial = entrada.nextFloat();
		System.out.println("Ingresa la calificacion del examen Final: ");
		examenFinal = entrada.nextFloat();
		
		
		total = (participacion * 0.10f) + (pEParcial * 0.25f) + (sEParcial * 0.25f) + (examenFinal *0.40f);
		System.out.println("Calificacion Total: "+ total);
		
	}
}
