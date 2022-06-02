import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String [] args) {
		int numero,dato = 5;
		int ent;
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
		
		/*
		 *  == igualdad
		 *  != diferencia
		 *  >mayor
		 *  >= mayor o igual a
		 *  < menor
		 *  <= menor o igual
		 * */
		if(numero != dato) {
			JOptionPane.showMessageDialog(null, "El numero es diferente a 5");
		}else {
			JOptionPane.showMessageDialog(null, "El numero es 5");
		}
		
		//Condicionales multiples
		
		ent = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 o 5"));
		
		switch(ent) {
		case 1: JOptionPane.showMessageDialog(null, "es el numero 1");
			break;//break = salir del swith
		case 2: JOptionPane.showMessageDialog(null, "es el numero 2");	
			break;
		case 3: JOptionPane.showMessageDialog(null, "es el numero 3");	
			break;
		case 4: JOptionPane.showMessageDialog(null, "es el numero 4");	
			break;
		case 5: JOptionPane.showMessageDialog(null, "es el numero 5");	
			break;	
		
		default: JOptionPane.showMessageDialog(null, "El numero no esta en rango del numero 5");	
			break;
		}
		//Ternario
		
		int nume;
		String msg;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		
//		msg = (numero%2==0) ?"Es par" :"es impar";
	
		JOptionPane.showMessageDialog(null, (numero%2==0) ?"Es par" :"es impar");
	}
}
