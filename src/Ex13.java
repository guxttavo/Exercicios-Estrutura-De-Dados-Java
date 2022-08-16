/*
-->Criar um vetor A com 10 elementos inteiros
-->Implementar um programa que determine a soma dos elementos armazenados neste vetor
   que são múltiplos de 5.
*/

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[3];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 5 == 0) {
                soma += vetorA[i];
            }
        }

        System.out.println("Valor da soma: ");
        System.out.println(soma);


    }
}
