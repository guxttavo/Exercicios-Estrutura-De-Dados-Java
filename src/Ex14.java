/*
-->Criar um vetor A com 10 elementos inteiros.
-->Implementar um programa que defina e escreva a média aritmética simples dos elementos
   ímpares armazenados neste valor.
 */


import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int soma = 0;
        int qtnImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                soma += soma + vetorA[i];
                qtnImpar++;
            }
        }

        System.out.println("Media: " + soma / qtnImpar);

    }
}
