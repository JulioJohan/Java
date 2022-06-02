import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String [] args) {

		char cara;
		
		cara = JOptionPane.showInputDialog("Ingresa Un Caracter: ").charAt(0);
		
		if(Character.isLowerCase(cara)) {
			JOptionPane.showMessageDialog(null, "Es minuscula");
		}else {
			JOptionPane.showMessageDialog(null, "Es mayuscula");
		}
	}
}
