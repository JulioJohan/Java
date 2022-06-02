import javax.swing.JOptionPane;

public class Ejercicio12 {
	public static void main(String [] args) {
		int nota;
		
		nota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una nota: de 0 a 10"));
				
		
		switch(nota) {
		case 1 :
		case 2: JOptionPane.showMessageDialog(null, "Insuficiente"); 
			break;
		case 3:
		case 4: JOptionPane.showMessageDialog(null, "Suficiente"); 
			break;
		case 5:
		case 6: JOptionPane.showMessageDialog(null, "Bien"); 
			break;
		case 7:
		case 8:	JOptionPane.showMessageDialog(null, "Notable"); 
			break;
		case 9:
		case 10: JOptionPane.showMessageDialog(null, "Sabresaliente"); 
		default: JOptionPane.showMessageDialog(null, "Ingresa una nota valida"); 
			break;
		}
	}

}	
