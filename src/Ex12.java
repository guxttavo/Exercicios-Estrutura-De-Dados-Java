/*
-->Criar um vetor A com 10 elementos inteiros.
-->Implementar um programa que defina e escreva a soma de todos os elementos armazenados
   neste velor.
 */


import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            soma = soma + vetorA[i];
        }

        System.out.println("Soma total do valores do vetor A: " + soma);

    }
}
