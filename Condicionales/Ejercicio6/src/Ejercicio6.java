import javax.swing.JOptionPane;

public class Ejercicio6 {
	public static void main(String [] args) {
		float numero1, numero2;
		
		numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el primer numero: "));
		numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingresa el segundo numero: "));
		
		if((numero1%2==0)&& (numero2%2==0))  {
			JOptionPane.showMessageDialog(null, "Ambos numeros son Iguales");
		}else if ((numero1 %2!=0)&&(numero2 %2!=0)){
			JOptionPane.showMessageDialog(null, "Ambos numeros son pares");
		}
		else {
			JOptionPane.showMessageDialog(null, "Uno es par y el otro es impar");

		}
		
	}
		
}
