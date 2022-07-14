package exercicio4;

import java.util.Scanner;
/* Exercicio 4 da semana 2 do FuturoDev, pede 3 notas e retorna m�dia
Autor: Marina Larissa Carpes R�hrig
Data: 14/07/22
 */
public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double primeiraNota,segundaNota,terceiraNota,media;
        System.out.print("***********************\n");
        System.out.println("Ol�! Vamos calcular a sua m�dia!");
        System.out.print("***********************\n");

        System.out.println("Digite a sua primeira nota, por favor:");
        primeiraNota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a sua segunda nota, por favor:");
        segundaNota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a sua terceira nota, por favor:");
        terceiraNota = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Obrigada pelas informa��es!\n\n");
        media = (primeiraNota+segundaNota+terceiraNota)/3;
        System.out.print("***********************\n");
        System.out.printf("As suas notas foram:%n |%.1f| %n |%.1f| %n |%.1f| %n" +
                        " A m�dia das suas tr�s notas �: %n |%.1f| %n",
                        primeiraNota,segundaNota,terceiraNota,media);

        if (media<7){
            System.out.println("Infelizmente voc� foi REPROVADO, boa sorte na recupera��o!");
        }else{
            System.out.println("Parab�ns! Voc� foi APROVADO!");
        }
        System.out.print("***********************\n");

        scanner.close();
    }
}
