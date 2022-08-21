/*
-->Ler um vetor A com 10 elementos inteiros correspondentes as idades de um grupo de pessoas.
-->Escreva um programa que determine e escreva a quantidade de pessoas que possuem idade superior
   a 35 anos.
 */

import java.util.Random;
import java.util.Scanner;

public class Ex17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random numerosAleatorios = new Random();

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = numerosAleatorios.nextInt(60);
        }

        int qnt35anos = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] > 35) {
                qnt35anos++;
            }
        }

        System.out.println("Idades: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Idades acima de 35 anos: " + qnt35anos);


    }
}
