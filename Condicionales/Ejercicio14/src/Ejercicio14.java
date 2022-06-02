import javax.swing.JOptionPane;

public class Ejercicio14 {
	public static void main(String[] args) {
	
		int opciones;
		double cantidad, total;
		opciones = Integer.parseInt(JOptionPane.showInputDialog("Ingresa 1,2 o 3 para las siguientes opciones: \n"
																		+ "1.- kG a GR \n"
																		+ "2.- kg a Onzas \n "
																		+"3.- kg a Mg" ));
		
		switch(opciones) {
			case 1: 
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa una cantidad: "));
				total = cantidad * 1000;
				JOptionPane.showMessageDialog(null, "Total de kg: " + cantidad  + "Gramos"  + total );
				break;
			case 2:
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa una cantidad: "));
				total = cantidad / 0.02834952;
				JOptionPane.showMessageDialog(null, "Total de kg: " + cantidad  + "Onzas: "  + total );
				break;
			case 3: 
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa una cantidad: "));
				total = cantidad * 1000000;
				JOptionPane.showMessageDialog(null, "Total de kg: " + cantidad  + "MG: "  + total );
				break;
			default: 
				JOptionPane.showMessageDialog(null, "Ingresa una de las tres opciones, opcion invalida" );
				break;
		}
		
	}
}
