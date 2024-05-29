package aula;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aula4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
     
        System.out.println("Bem-vindo à garagem!");

        // Construção da garagem
        garagem.add("Camaro");
        garagem.add("Fusca");
        garagem.add("Meriva");
        garagem.add("HB20");
        garagem.add("Onix");
        garagem.add("Polo");


        // Apresentação dos carros estacionados
        System.out.println("Carros estacionados na garagem:");
        for (String carro : garagem) {
            System.out.println(carro);
        }

        ler.close();
    }

	}


