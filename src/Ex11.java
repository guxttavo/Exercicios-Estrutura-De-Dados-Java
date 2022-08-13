/*
-->Crie um vetor A com 10 elementos inteiros.
-->Implementar um programa que defina e escreva a quantidade de elementos armazenados
   neste vetor que são pares.
*/

import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int qtnPares = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                qtnPares++;
            }
        }

        System.out.println("Quantidade numeros pares: " + qtnPares);
    }
}
