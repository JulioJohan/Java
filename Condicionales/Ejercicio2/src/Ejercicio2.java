import javax.swing.JOptionPane;

public class Ejercicio2 {
	public static void main(String [] args) {

		int numero1,numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: ")); 
		
		if(numero1> numero2) {
			JOptionPane.showMessageDialog(null, "El numero uno es mayor o igual que el numero dos");
		}else if (numero2 > numero1) {
			JOptionPane.showMessageDialog(null, "El numero dos es mayor o igual que numero uno");
		}else {
			JOptionPane.showMessageDialog(null, "Los numero son iguales");
		}
		
	}

}
