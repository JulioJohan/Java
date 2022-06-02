import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float[] numeros = new float[5];
		float suma_positivos = 0, suma_negativos = 0, medio_positivos, media_negativos ;
		int conteo_positivos = 0, conteo_negativo = 0, conteo_ceros =0;
		
		
		
		System.out.println("Guardando numeros... ");
		for(int i = 0; i<5; i++) {
			System.out.println("Ingresa un numero: ");
			numeros[i] = entrada.nextFloat();
		
			
			if (numeros[i] == 0) {
				conteo_ceros++;
			}else if(numeros[i] > 0) {
				suma_positivos += numeros[i];
				conteo_positivos ++;
			}else {
				suma_negativos += numeros[i];
				conteo_negativo ++;
			}
			
		}
		
		//Media de los numeros positivos
		if(conteo_positivos == 0) {
			System.out.println("No se puden sacar los numeros poositivos");
		}else {
			medio_positivos = suma_positivos/ conteo_positivos;
			System.out.println("la media de los numeros positivos " +medio_positivos);
		}
		
		//Media de los numeros negativos
		if(conteo_negativo == 0) {
			System.out.println("No se puden sacar los numeros negativos");
		}else {
			media_negativos = suma_negativos/ conteo_positivos;
			System.out.println("la media de los numeros negativos " +media_negativos);
		}
		
	}

}
