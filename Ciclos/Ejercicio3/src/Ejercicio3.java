import javax.swing.JOptionPane;

public class Ejercicio3 {
	public static void main(String[] args) {
		int numeros;
		
		numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero"));
		
		while(numeros !=0) { //mientras el numero sea distingo de 0
			if(numeros%2==0 ) {
				JOptionPane.showMessageDialog(null, "Es par");
			}else if(numeros%2!=0) {
				JOptionPane.showMessageDialog(null, "Es impar");
			}
				
			numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));
		
		
		}

	}
}
