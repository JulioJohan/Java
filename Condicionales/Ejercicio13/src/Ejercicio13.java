import javax.swing.JOptionPane;

public class Ejercicio13 {
	public static void main(String[] args) {
		int sueldo = 1000; 
		int dinero = 0, opciones, total;
		
		opciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa una opcion: \n"
												+ "1. - Ingresar dinero a la cuenta \n"
												+ "2. - Retirar dinero de la cuenta \n"
												+ "3. - Salir "));
	 
		switch(opciones) {
			case 1:
				dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar dinero a la cuenta: "));
				sueldo += dinero;
				JOptionPane.showMessageDialog(null,"Total de saldo: " + sueldo);
				break;
			case 2:
				dinero = Integer.parseInt(JOptionPane.showInputDialog("Retira dinero: "));
				if(dinero > sueldo ) {
					JOptionPane.showMessageDialog(null, "El Dinero que quiere retirar es mayor a los que tiene");
				}
				sueldo -= dinero;
				JOptionPane.showMessageDialog(null, "Su total de dinero es: " + sueldo);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "saliendo ...");
			default: JOptionPane.showMessageDialog(null, "Ingresa una opcion valida");	
				break;
		}
	}
}
