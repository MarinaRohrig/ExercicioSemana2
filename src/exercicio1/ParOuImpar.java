package exercicio1;
// Exerc�cio 1 da semana 2 do Futuro Dev, esse vai receber um n�mero e verificar se � par ou impar
// Autor: Marina Larissa Carpes R�hrig
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um n�mero inteiro: ");
        int numeroDigitado = scanner.nextInt();
        // leitura de uma vari�vel que recebe o pr�ximo inteiro digitado.

        if ((numeroDigitado % 2) == 0){ // Verifica o mod ( resto de divis�o) do n�mero digitado
            // se igual a 0 o n�mero � par, sen�o, � impar.
            System.out.printf("O n�mero %d � par! ", numeroDigitado);
        } else {
            System.out.printf("O n�mero %d � impar! ", numeroDigitado);
        }
    }
}
