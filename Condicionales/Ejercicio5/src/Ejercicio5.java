import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String [] args) {
		
		int horasTrabajadas = 0;
		float salarioTotal = 0;
		
		horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa Horas trabajadas: "));
		
		if(horasTrabajadas <= 40 ) {
			salarioTotal = horasTrabajadas * 16;
		}
		if(horasTrabajadas > 40) {
			salarioTotal = (40*16) + (horasTrabajadas - 40 ) *20;
	
		}
		 
		JOptionPane.showMessageDialog(null, "Salario Semanal: " + salarioTotal );
	}

}
