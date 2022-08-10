/*
-->Criar um vetor com 10 elementos inteiros.
-->Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o respectivo do elemento de A multiplicado por sua posição(ou índice), ou seja,
B[i] = A[i] * i
*/

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com um valor da posicao " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println();


        System.out.println("Vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

    }
}
