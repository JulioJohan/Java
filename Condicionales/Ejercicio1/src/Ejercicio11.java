import javax.swing.JOptionPane;

public class Ejercicio11 {
	public static void main(String[] args) {
		int n1,n2, suma, resta,multiplicacion,div;
		char operacion;
		
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
		
		operacion = JOptionPane.showInputDialog("Digite la operacion que desea realizar : \n"
												+ "	s,s: suma \n"
												+ "R, r: resta \n"
												+ "P, p,M,m: Multiplicar \n"
												+ "D, d: Division").charAt(0);
		
		
		switch (operacion) {
		case 's':
		case 'S':suma = n1+n2;
			JOptionPane.showMessageDialog(null, "La suma es: " + suma);
			break;
		case 'R':
		case 'r': resta = n1 - n2;
		JOptionPane.showMessageDialog(null, "La resta es: " + resta);
			break;
		case 'P':
		case 'p':
		case 'M':
		case 'm': multiplicacion = n1*n2;
		JOptionPane.showMessageDialog(null, "La multiplicacion: " + multiplicacion);	
			break; 
		case 'd':
		case 'D': div = n1 /n2;
		JOptionPane.showMessageDialog(null, "La division: "+ div);	
			break;
		default: JOptionPane.showMessageDialog(null, "Ingresa un letra: ");	
		
		}
		
	}

}
