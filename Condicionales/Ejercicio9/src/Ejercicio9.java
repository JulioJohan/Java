import javax.swing.JOptionPane;

public class Ejercicio9 {
	public static void main(String[] args) {
		int dia, mes, anio; 
		
		dia =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
		anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anio: "));
		
		
		if((dia>= 1)&&(dia<=30)) {//Si el dia es correcto
			if((mes >= 1)&&(mes<=12)) {// si el mes es correcto
				if ((anio >=2000 )&&(anio <2100)) {//si el anio es correcto
					JOptionPane.showMessageDialog(null, "Fecha Correcta ");
				}else {
					JOptionPane.showMessageDialog(null, "Anio Incorrecto ");
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "Mes incorrecto ");
			}
					
		}else{
			JOptionPane.showMessageDialog(null, "dia Incorrecto ");	
		}
		
		
		
	}

}
