import java.util.Scanner;

public class SegundoDesafio {

    /*
    Desafio
        Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

    Entrada
        A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.

    Saída
        A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
     */

    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        int soma = 0;
        int cont;
        int auxcoaut = 0;

        cont = N / A;
        for (int i = 1; i <= cont; i++) {

            soma = A * i;
            auxcoaut = auxcoaut + soma;
        }

        System.out.println(auxcoaut);
    }
}
