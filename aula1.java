package aula;

import java.util.Scanner;

public class aula1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	double a, b, soma, sub, multi, div;
     
	System.out.println(" valo1: ");
	a = ler.nextDouble();
	
	
	System.out.println(" valor2: ");
	b = ler.nextDouble();
	//processamento
	soma = a+b;
	sub = a-b;
	multi = a*b;
	div = a/b;
	
	System.out.println("resultado da soma:" + soma);//saida
	System.out.println("resultado da sub:" + sub);//saida
	System.out.println("resultado da multi:" + multi);//saida
	System.out.println("resultado da div:" + div);//saida
	
	ler.close();
	
	}

}
