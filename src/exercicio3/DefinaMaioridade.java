package exercicio3;

import java.util.Scanner;
// Exerc�cio 3 da semana 2 do Futuro Dev, perguntar a idade e escrever se � maior de idade ou n�o
// Autor: Marina Larissa Carpes R�hrig
public class DefinaMaioridade {
    public static void main(String[] args) {
        int idadeDoUsuario;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idadeDoUsuario = scanner.nextInt();

        if (idadeDoUsuario<18) {
            System.out.printf("Voc� tem %d anos e � menor de idade! \n", idadeDoUsuario);
        }else{
            System.out.printf("Voc� tem %d anos e � maior de idade! \n", idadeDoUsuario);
            }

        scanner.close();
    }
}
