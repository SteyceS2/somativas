package aula;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); //instanciar classe scanner
		double a, b, h;//variaveis
		//entrada
		System.out.println(" valo 1: ");
		h = ler.nextDouble();
		
		//entrada
		System.out.println(" valo 2: ");
		b = ler.nextDouble();
		
		//processamento
		a = (b * h) / 2; 
		//saida
		System.out.println("A area é:" + a);
		
		
		ler.close();
		
		
		

	}

}
