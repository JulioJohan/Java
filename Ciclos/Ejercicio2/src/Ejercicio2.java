import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero:"));
	
		//o while numero !==0
		while(numero > 0 | numero < 0) {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un Numero:"));

			
		}
	}

}
