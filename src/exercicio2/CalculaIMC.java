package exercicio2;
// Exercício 2 da semana 2 do Futuro Dev, calcular IMC. IMC=Peso/(altura²), com 3 casas decimais
// Autor: Marina Larissa Carpes Röhrig

import java.util.Scanner;

public class CalculaIMC {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Float altura, peso;

        // Recebe as variáveis float de altura e peso digitadas pelo usuário
        System.out.println("~~ Bem-vindo a calculadora de IMC! ~~");
        System.out.println(" Como no exemplo: 1,58 \n Digite a sua altura, em metros e cm, por favor:   ");
        altura = scanner.nextFloat();
        System.out.println(" Como no exemplo: 80,654 \n Digite o seu peso,em kg, por favor:   ");
        peso = scanner.nextFloat();

        // calcula o IMC e mostra as infos com 3 casas após a vírgula
        System.out.printf("A sua altura é:%.3f %n",altura);
        System.out.printf("O seu peso é:%.3f %n",peso);
        float imc = peso / ( altura * altura);
        System.out.printf("O seu IMC ( peso/(altura x altura) ) é: %.3f \n",imc);

        //Mostra resultado com base no ICM
        if (imc < 18.5) {
            System.out.println("Você está abaixo do Peso Ideal.\n");
        }else if (imc < 24.9) {
            System.out.println("Você está com o Peso Ideal.\n");
        }else if (imc < 29.9) {
            System.out.println("Você está com Sobrepeso.\n");
        }else if(imc < 34.9) {
            System.out.println("Você está com Obesidade Grau I.\n");
        }else if ( imc < 39.9) {
            System.out.println(" Você está com Obesidade Grau II.\n");
        }else{
            System.out.println("Você está com Obesidade Grau III.\n");
                            }
        }
    }

