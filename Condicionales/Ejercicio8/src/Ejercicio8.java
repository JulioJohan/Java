import javax.swing.JOptionPane;

public class Ejercicio8 {
	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero entre 0 y 99 999: "));

	
	
		if(numero <= 9) {
			JOptionPane.showMessageDialog(null, "El numero tiene un digito ");
		}else if((numero >=10) & (numero <= 99)) {
			JOptionPane.showMessageDialog(null, "El numero tiene dos digitos ");
		}else if ((numero >= 100)&&(numero <=999)) {
			JOptionPane.showMessageDialog(null, "El numero tiene tres digitos ");
		}else if ((numero >= 1000)&&(numero <=9999)) {
			JOptionPane.showMessageDialog(null, "El numero tiene cuatro digitos ");
		}else if ((numero >= 10000)&&(numero <= 99999)) {
			JOptionPane.showMessageDialog(null, "El numero tiene cinco digitos ");
		}
	}

}
