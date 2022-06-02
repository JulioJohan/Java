import javax.swing.JOptionPane;

public class Ejercicio5 {
	public static void main(String[] args) {
	int numero,intentos = 0,numeroAleatorio;
	
	numeroAleatorio = (int)(Math.random()*100+1);//generar un numero aleatorio
	
	System.out.println(numeroAleatorio);
	
	
	do {
		numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));	
		if(numeroAleatorio > numero) {
			JOptionPane.showMessageDialog(null, "Digita un numero mayor" );
		}else if (numeroAleatorio < numero) {
			JOptionPane.showMessageDialog(null, "Digita un numero menor" );
		}
		intentos ++; //Aumentamos el contador

	}while(numero != numeroAleatorio);
	
	JOptionPane.showMessageDialog(null, "Ganaste, Adivinaste el numero en: " +numeroAleatorio  );

	}
}
