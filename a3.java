package aula;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

        //entrada
        System.out.println("Digite um valor de 1 a 7 para representar o dia da semana:");
        int valorDia = ler.nextInt();
        
        String diaSemana = "";
        //processamento de saida de dados
        switch (valorDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                System.out.println("Valor inválido. Por favor, digite um número de 1 a 7.");
                return;
        }
        //saida
        System.out.println("O dia da semana correspondente ao valor digitado é: " + diaSemana);
        
        ler.close();
    }


	}

