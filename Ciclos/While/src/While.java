import java.util.Scanner;

/*
 * While(condicion){
 * Instrucciones;
 * }
 * */

/*
 * for(inicializacion; condicion; aumento o decremento){
 * Instrucciones
 * }
 * */

public class While {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i=1, contador;
		//While
		System.out.println("Digite cuanto numeros quieres en pantalla: ");
		contador = entrada.nextInt();
		
		while(i <= contador) { 
			System.out.println(i);
			i++;
		}
		
		
		//Do While
		int a =1;
		do {
			System.out.println(i);
			i++;
		}while(i<= 10);
		
		for(int o = 1; o<=10; o++) {
			System.out.println(o);
		}
		
	}
}
