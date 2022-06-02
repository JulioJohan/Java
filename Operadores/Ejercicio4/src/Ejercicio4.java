import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String [] args) {
	Scanner entrada = new Scanner(System.in);
	
	final int salario = 1000;
	int carro;
	float carroVendido,total, valorVenta;
	
	
	System.out.println("Cuanto carros vendio? ");
	carro = entrada.nextInt();
	
	System.out.println("Precio del carro Vendido: ");
	carroVendido = entrada.nextFloat();
	
	carro *= 150;
	
	valorVenta = carroVendido / 100;
	
	total = salario + valorVenta + carro;
	
	System.out.println("Total Mes: " + total);
	
	//salarioTotal = salario + (nCarrosVendidos * 150) + (0.05f*costeCarro*nCarrosVendidos)
	
	}
}
