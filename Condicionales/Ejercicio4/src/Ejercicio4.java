import javax.swing.JOptionPane;

public class Ejercicio4 {
	public static void main(String [] args) {

		float compra, descuento;
		
		compra = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad: "));
		
		if(compra > 300) {
			
			descuento = compra *0.20f;
			compra -=descuento;
			
			JOptionPane.showMessageDialog(null, "Total a pagar: " + compra);
		}else {
			JOptionPane.showMessageDialog(null, "Total a pagar " + compra);
		}
		
	}
}
