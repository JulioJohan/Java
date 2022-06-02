package ejercicio;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		int horasSemanales;
		float salarioHora, salarioTotal;
		
		System.out.println("Digite las horas semanales trabajadas: ");
		horasSemanales = entrada.nextInt();
		
		System.out.println("Digite salario por hora: ");
		salarioHora = entrada.nextFloat();
		
		salarioTotal = horasSemanales * salarioHora;
		System.out.println("El salario semanal: "+ salarioTotal);
	}
}
