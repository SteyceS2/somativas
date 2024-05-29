package aula;

import java.util.Scanner;

public class a4 {

	  public static void main(String[] args) {
		  Scanner ler = new Scanner(System.in);

	        
	        String[] nomes = new String[6];

	        System.out.println("Digite os carros:");

	       
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Nome " + (i + 1) + ": ");
	            nomes[i] = ler.nextLine();
	        }

	      
	        System.out.println("\nNomes armazenados no vetor:");
	        for (int i = 0; i < 6; i++) {
	            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
	        }

	    
	        ler.close();
	    }
	

	}


