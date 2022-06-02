import javax.swing.JOptionPane;

public class Ejercicio1 {
	public static void main(String [] args) {
		int numero;
		
		
		numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digita un numero: "));
		
		if(numero %10==0) {
			JOptionPane.showMessageDialog(null, "El numero: " +numero + " es multiplo de 10");
		}else {
			JOptionPane.showMessageDialog(null, "El numero: "+numero + "no es multiplo de 10");
		}
		
	}
}
