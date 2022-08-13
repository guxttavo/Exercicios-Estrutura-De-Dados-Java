/*
-->Criar dois vetores A e B cada um com 10 elementos inteiros.
-->Construir um vetor C, onde cada elemento de C é a divisão dos respectivos
   elementos em A e B, ou seja,
   C[i] = A[i] / B[i]

 */

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[2];
        int[] vetorB = new int[2];
        double[] vetorC = new double[2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do vetor B da posicao: " + i);
            vetorB[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
        }

        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("Vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

        System.out.println("Vetor C");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
    }

}
