/*
-->Criar um vetor A com 10 elmentos inteiros.
-->Desenvolver um programa que defina o percentual de elementos pares e ímpares,
   respectivamente, armazenados neste vetor.
 */

import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];


        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int qtnImpar = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0) {
                qtnImpar++;
            }
        }

        int qtnPar = vetorA.length - qtnImpar;

        double porcPar = (qtnPar * 100) / vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.println("Vetor A= ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.println("Porcetagem Par: " + porcPar + "%");
        System.out.println("Porcetagem Impar: " + porcImpar + "%");

    }
}
