package exercicio6;

import java.util.Random;
import java.util.Scanner;

/* Exercicio 6 da semana 2 do FuturoDEV, que deve perguntar para adivinhar o n�mero de 1 a 5
gerar um n�mero de 1 a 5 e comparar os n�meros, se for igual, informar que acertou, se for diferente diz
que errou e informa o n�mero correto
Data: 18/07/22
Autor: Marina Larissa Carpes R�hrig
 */
public class AdivinheONumero {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroDoUsuario, numeroRandom;
        System.out.println("~~ Adivinhe o N�mero ~~");
        System.out.println("Digite um n�mero de 1 a 5");
        numeroDoUsuario = Integer.parseInt(scanner.nextLine());
        numeroRandom = random.nextInt(5);
        if (numeroDoUsuario == numeroRandom){
            System.out.println("O n�mero secreto era:"+numeroRandom+"e voc� acertou!");
        }else{
            System.out.println("O n�mero secreto era:"+numeroRandom+" e voc� errou!");
        }
    }
}
