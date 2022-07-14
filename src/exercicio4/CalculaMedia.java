package exercicio4;

import java.util.Scanner;
/* Exercicio 4 da semana 2 do FuturoDev, pede 3 notas e retorna média
Autor: Marina Larissa Carpes Röhrig
Data: 14/07/22
 */
public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double primeiraNota,segundaNota,terceiraNota,media;
        System.out.print("***********************\n");
        System.out.println("Olá! Vamos calcular a sua média!");
        System.out.print("***********************\n");

        System.out.println("Digite a sua primeira nota, por favor:");
        primeiraNota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a sua segunda nota, por favor:");
        segundaNota = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a sua terceira nota, por favor:");
        terceiraNota = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Obrigada pelas informações!\n\n");
        media = (primeiraNota+segundaNota+terceiraNota)/3;
        System.out.print("***********************\n");
        System.out.printf("As suas notas foram:%n |%.1f| %n |%.1f| %n |%.1f| %n" +
                        " A média das suas três notas é: %n |%.1f| %n",
                        primeiraNota,segundaNota,terceiraNota,media);

        if (media<7){
            System.out.println("Infelizmente você foi REPROVADO, boa sorte na recuperação!");
        }else{
            System.out.println("Parabéns! Você foi APROVADO!");
        }
        System.out.print("***********************\n");

        scanner.close();
    }
}
