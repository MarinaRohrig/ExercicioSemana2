package Exercicio2;
// Exercício 2 da semana 2 do Futuro Dev, calcular IMC. IMC=Peso/(altura²), com 3 casas decimais
// Autor: Marina Larissa Carpes Röhrig

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

        System.out.printf("A sua altura é:%.3f%n",altura);
        System.out.printf("O seu peso é:%.3f%n",peso);
        System.out.printf("O seu IMC ( peso/(altura x altura) ) é: %.3f",peso/(altura*altura));


    }
}
