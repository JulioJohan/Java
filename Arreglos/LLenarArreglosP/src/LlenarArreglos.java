import java.util.Scanner;

import javax.swing.JOptionPane;

public class LlenarArreglos {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nHeroes;
		
		nHeroes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de Heroes: "));
		
		
		String[] heroes = new String [nHeroes];
		
		System.out.println("Digita los nombres de los heroes: ");
		for(int i = 0; i<nHeroes; i++) {
			System.out.println("Digita un heroe");
			heroes[i] = entrada.next();
		}
		System.out.println("Los nombres de los heroes son: ");
		for (int i = 0; i <nHeroes; i++) {
			System.out.println(heroes[i]);
		}
		
		int lHeroes;
		lHeroes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para la lista de heroes: "));
		
		String[] hero = new String[lHeroes];
		
		System.out.println("Digita los nombres de los heroes: ");
		for(int i = 0; i <lHeroes ; i++) {
			System.out.println("Ingresa un heroe");
			hero[i] = entrada.next();
		}
		
		for (int i= 0; i< lHeroes; i++) {
			System.out.println(hero[i]);
		}
		
		
		int nVillanos;
		
		
		nVillanos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa cuantos villanos quieres agregar: "));
		
		String[] villanos = new String[nVillanos];
	
		System.out.println("Digita los nombres de los villanos: ");
		for(int i = 0; i< nVillanos; i++) {
			System.out.println("Ingresa un villano: ");
			villanos[i]=entrada.next();
		}
		
		for (int i = 0; i <nVillanos; i ++) {
			System.out.println("Los nombres de los villanos son " + villanos[i]);
		}
		
		
	}
}
