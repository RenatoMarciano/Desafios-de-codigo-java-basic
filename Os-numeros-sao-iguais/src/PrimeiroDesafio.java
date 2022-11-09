import java.util.Scanner;

public class PrimeiroDesafio {

    /*
    Desafio
        Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário,
        retorne "Nao sao iguais!” sem as aspas.

    Entrada
        As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros.

    Saída
        A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário,  retorne "Nao sao iguais!",
        sem as aspas.
     */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            //TODO: Imprima se os valores numéricos passados são iguais ou não.
            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a != b){
                System.out.println("Nao sao iguais!");
            } else {
                System.out.println("Sao iguais!");
            }

        }

}
