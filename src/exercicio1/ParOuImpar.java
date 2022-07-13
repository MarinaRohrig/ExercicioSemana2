package exercicio1;
// Exercício 1 da semana 2 do Futuro Dev, esse vai receber um número e verificar se é par ou impar
// Autor: Marina Larissa Carpes Röhrig
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();
        // leitura de uma variável que recebe o próximo inteiro digitado.

        if ((numeroDigitado % 2) == 0){ // Verifica o mod ( resto de divisão) do número digitado
            // se igual a 0 o número é par, senão, é impar.
            System.out.printf("O número %d é par! ", numeroDigitado);
        } else {
            System.out.printf("O número %d é impar! ", numeroDigitado);
        }
    }
}
