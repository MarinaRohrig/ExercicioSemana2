package Exercicio2;
// Exerc�cio 2 da semana 2 do Futuro Dev, calcular IMC. IMC=Peso/(altura�), com 3 casas decimais
// Autor: Marina Larissa Carpes R�hrig

import java.util.Scanner;

public class calculaIMC {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Float altura, peso;

        System.out.println("~~ Bem-vindo a calculadora de IMC! ~~");
        System.out.println(" Como no exemplo: 1,58 \n Digite a sua altura, por favor:   ");
        altura = scanner.nextFloat();
        System.out.println(" Como no exemplo: 80,654 \n Digite o seu peso, por favor:   ");
        peso = scanner.nextFloat();

        System.out.printf("A sua altura �:%.3f%n",altura);
        System.out.printf("O seu peso �:%.3f%n",peso);
        System.out.printf("O seu IMC ( peso/(altura x altura) ) �: %.3f",peso/(altura*altura));


    }
}
