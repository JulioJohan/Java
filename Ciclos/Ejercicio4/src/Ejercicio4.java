import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String[] args) {
		int numero,contador = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
		
		while(numero >= 0 ) {//Mientras numero no sea negativo
			contador++; //Aumentamos en 1 el contador
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));

		}
		System.out.println("Ha introducido: " + contador + "No negativos");
		
		
		
	}
}
