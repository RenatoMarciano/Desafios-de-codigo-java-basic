import java.util.Scanner;

public class TerceiroDesafio {

    /*
    Descrição
        Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.

    Entrada
        A Entrada será composta por um número inteiro, N.

    Saída
        Será  impresso o somatório de N até 0, como no exemplo a baixo:
     */

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        //TODO: Imprima o somatório de N (utilize o método "somatorio").
        int num1;
        int somatoria = 0;

        num1 = numero.nextInt();

        for (int i = num1; i >= 0; i--){
            somatoria = somatoria + i;
        }
        System.out.println(somatoria);
    }
}
