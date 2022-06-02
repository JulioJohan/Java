import javax.swing.JOptionPane;

public class Ejercicio10 {
	public static void main(String[] args) {
		int dia, mes, anio; 
		
		dia =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes: "));
		anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el anio: "));
		
		
		if((dia>= 1)&&(dia<=31)) {
			if((mes == 1) || (mes== 3) || (mes == 5) || (mes == 8) || (mes == 10 ) || (mes == 12)) {
				if((anio >= 2000)&& (anio<=2100)) {
					JOptionPane.showMessageDialog(null, "Fecha Correcta: Enero, Marzo, Mayo , Agosto , Octubre, Diciembre");
				}
			}
				
		
		}else if((dia>= 1)&&(dia<=28)) {
			if(mes == 2) {
				if((anio >= 2000)&& (anio<=2100)) {
					JOptionPane.showMessageDialog(null, "Fecha Correcta: Febrero");
				}
				
			}
			
		}else if ((dia>= 1)&&(dia<=30)) {
			if((mes == 4) ||(mes == 6) || (mes == 7) || (mes == 9) || (mes == 11)) {
				if((anio >= 2000)&& (anio<=2100)) {
					JOptionPane.showMessageDialog(null, "Fecha Correcta: Abril , Junio , Julio , Septiembre y Noviembre");
				}
			}
		}else {
			JOptionPane.showMessageDialog(null, "Fecha Incorrecta");
		}
		//((mes == 1 || mes == 3 || mes || 5) &&(dia >=1 && dia <=31)
		
		
	}

}
