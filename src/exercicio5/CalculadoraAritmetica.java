package exercicio5;

import java.util.Locale;
import java.util.Scanner;

/* Exercicio 5 da semana 2 do FuturoDEV, criar uma calculadora que deve pedir um número
depois outro e por último qual operação deve ser realizada "somar", subtrair, multiplicar ou dividir
Data: 18/07/22
Autor: Marina Larissa Carpes Röhrig
 */
public class CalculadoraAritmetica {
    public static void main(String[] args) {
        double primeiroNumero, segundoNumero;
        double resultado=0;
        String repetir;
        String operacao,operacaoTexto=null;
        System.out.println("------------------------------");
        System.out.println("^^^ Bem-vindo a calculadora! ^^^");
        System.out.println("------------------------------");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Digite o primeiro número, por favor: ");
            primeiroNumero = Double.parseDouble(scanner.nextLine());
            System.out.println("Digite o segundo número, por favor:");
            segundoNumero = Double.parseDouble(scanner.nextLine());
            System.out.println("Digite a operação que deseja realizar: \n\n" +
                    "SOMAR\n" +
                    "SUBSTRAIR\n" +
                    "MULTIPLICAR \n" +
                    "DIVIDIR \n" +
                    "");
            operacao = scanner.nextLine();
            if (operacao.equalsIgnoreCase("somar")){
                resultado = primeiroNumero + segundoNumero;
                operacaoTexto="soma ";
            }else if (operacao.equalsIgnoreCase("subtrair")){
                resultado = primeiroNumero - segundoNumero;
                operacaoTexto="subtração ";
            }else if (operacao.equalsIgnoreCase("multiplicar")){
                resultado = primeiroNumero * segundoNumero;
                operacaoTexto="multiplicação ";
            }else if(operacao.equalsIgnoreCase("dividir")) {
                resultado = primeiroNumero / segundoNumero;
                operacaoTexto = "divisão ";
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("O resultado da "+ operacaoTexto +"entre os números "+ primeiroNumero +" e "+ segundoNumero+" é: "+ resultado);
            System.out.println("------------------------------------------------------------");
            System.out.println("Deseja fazer outra operação? " +
                    "Digite SIM para continuar:");
            repetir = scanner.nextLine().toUpperCase(Locale.ROOT);

        }while (repetir.equalsIgnoreCase("SIM"));

            System.out.println("------------------------------");
            System.out.println("Obrigada por usar a calculadora!");
            System.out.println("------------------------------");
       scanner.close();
        return;
    }
}
