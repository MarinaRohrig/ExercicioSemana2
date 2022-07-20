package exercicio2;
// Exercício 2 da semana 2 do Futuro Dev, calcular IMC. IMC=Peso/(altura²), com 3 casas decimais
// Data: 19/07/22
// Autor: Marina Larissa Carpes Röhrig

import java.util.Scanner;

public class CalculaIMC {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        Float altura, peso;

        // Recebe as variáveis float de altura e peso digitadas pelo usuário
        System.out.println("-------------------------------------");
        System.out.println("~~ Bem-vindo a calculadora de IMC! ~~");
        System.out.println("-------------------------------------");

        System.out.println(" Como no exemplo: 1,60 \n Digite a sua altura, por favor:   ");
        altura = scanner.nextFloat();
        // Aqui só aceita número com vírgula :')
        System.out.println(" Como no exemplo: 80,55 \n Digite o seu peso, em kg, por favor:   ");
        peso = scanner.nextFloat();
        // Calcula o IMC e mostra as infos com 3 casas após a vírgula
        System.out.printf("A sua altura é: %.2f %n",altura);
        System.out.printf("O seu peso é: %.3f %n",peso);
        float imc = peso / ( altura * altura);
        System.out.printf("O seu IMC é: %.2f \n",imc);
        System.out.println("----------------------------------");
        //Mostra resultado com base no IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do Peso Ideal.");

        }else if (imc < 24.9) {
            System.out.println("Você está com o Peso Ideal.");
        }else if (imc < 29.9) {
            System.out.println("Você está com Sobrepeso.");
        }else if(imc < 34.9) {
            System.out.println("Você está com Obesidade Grau I.");
        }else if ( imc < 39.9) {
            System.out.println(" Você está com Obesidade Grau II.");
        }else{
            System.out.println("Você está com Obesidade Grau III.");
                            }
        System.out.println("----------------------------------");
        scanner.close();
        }
    }

