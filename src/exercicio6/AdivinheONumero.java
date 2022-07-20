package exercicio6;

import java.util.Random;
import java.util.Scanner;

/* Exercicio 6 da semana 2 do FuturoDEV, que deve perguntar para adivinhar o número de 1 a 5
gerar um número de 1 a 5 e comparar os números, se for igual, informar que acertou, se for diferente diz
que errou e informa o número correto
Data: 18/07/22
Autor: Marina Larissa Carpes Röhrig
 */
public class AdivinheONumero {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroDoUsuario, numeroRandom;
        System.out.println("~~ Adivinhe o Número ~~");
        System.out.println("Digite um número de 1 a 5");
        numeroDoUsuario = Integer.parseInt(scanner.nextLine());
        numeroRandom = random.nextInt(5);
        if (numeroDoUsuario == numeroRandom){
            System.out.println("O número secreto era:"+numeroRandom+"e você acertou!");
        }else{
            System.out.println("O número secreto era:"+numeroRandom+" e você errou!");
        }
    }
}
