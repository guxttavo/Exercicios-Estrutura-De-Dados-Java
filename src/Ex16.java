/*
-->Criar um vetor A com 10 elementos inteiros.
-->Escrever um programa que calcule e escreva:
   -A quantidade de elementos armazenados no vetor que são iguais a 15.
   -A soma dos elementos armazenados neste vator que são inferiores a 15.
   -A média dos elementos armazendos no vetor que são superiores a 15.

 */


import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        int igualQuinze = 0;
        int somaMenorQuinze = 0;
        int somaMaiorQuinze = 0;
        int qtnMaiorQuinze = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igualQuinze++;
            } else if (vetorA[i] < 15) {
                somaMenorQuinze += vetorA[i];
            } else if (vetorA[i] > 15) {
                qtnMaiorQuinze++;
                somaMaiorQuinze += qtnMaiorQuinze;
            }
        }

        System.out.println("Soma dos elementos inferiores a 15: " + somaMenorQuinze);
        System.out.println("Elementos que sao iguais a 15: " + igualQuinze);
        System.out.println("Media dos numeros superiores a 15: " + (somaMaiorQuinze / qtnMaiorQuinze));

    }
}
