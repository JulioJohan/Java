import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String[] args) {
		int numero,incremento, suma = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
		
		while(numero != 0) {
			numero+=suma;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
			JOptionPane.showMessageDialog(null, "Total: " + numero);
		}
	}

}
