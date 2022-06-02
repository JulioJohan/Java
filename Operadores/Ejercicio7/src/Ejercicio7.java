import java.util.Scanner;

public class Ejercicio7 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		int totalH ,nSemanas,dias,horas;
		
		System.out.println("Ingresa la cantidad total: ");
		totalH = entrada.nextInt();
		
		dias = totalH %168/24 ;
		nSemanas = totalH / 168;
		horas = totalH%24;
		
		System.out.println("Total de dias" + dias);
		System.out.println("Total de horas" + horas);
		System.out.println("Total de semanas" + nSemanas);


		
		
		
	}
}
