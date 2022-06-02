import javax.swing.JOptionPane;

public class Ejercicio7 {
	public static void main(String[] args) {
		int numero1,numero2,numero3;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el primer numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el segundo numero: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Escribe el tercer numero: "));

		if((numero1 > numero2)&& (numero2>numero3)) {
			JOptionPane.showMessageDialog(null, "Ordern" + numero1 + "-" + numero2 + "-" + numero3);
		}else if ((numero3> numero2) && (numero1> numero3)) {
			JOptionPane.showMessageDialog(null, "Ordern" + numero1 + "-" + numero3 + "-" + numero2);
		}
		else if((numero2 >numero1) &&(numero1>numero3)) {
			JOptionPane.showMessageDialog(null, "Ordern" + numero2 + "-" + numero1 + "-" + numero3);
		}else if((numero2 > numero3)&&(numero3> numero1)) {
			JOptionPane.showMessageDialog(null, "Ordern" + numero2 + "-" + numero3 + "-" + numero1);
		}else if((numero3 > numero1)&&(numero1 > numero2)) {
			JOptionPane.showMessageDialog(null, "Ordern" + numero3 + "-" + numero1 + "-" + numero2);
		}else {
			JOptionPane.showMessageDialog(null, "Ordern" + numero3 + "-" + numero2 + "-" + numero1);
		}
	}
}
