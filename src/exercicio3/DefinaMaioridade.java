package exercicio3;

import java.util.Scanner;
// Exercício 3 da semana 2 do Futuro Dev, perguntar a idade e escrever se é maior de idade ou não
// Autor: Marina Larissa Carpes Röhrig
public class DefinaMaioridade {
    public static void main(String[] args) {
        int idadeDoUsuario;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        idadeDoUsuario = scanner.nextInt();

        if (idadeDoUsuario<18) {
            System.out.printf("Você tem %d anos e é menor de idade! \n", idadeDoUsuario);
        }else{
            System.out.printf("Você tem %d anos e é maior de idade! \n", idadeDoUsuario);
            }

        scanner.close();
    }
}
