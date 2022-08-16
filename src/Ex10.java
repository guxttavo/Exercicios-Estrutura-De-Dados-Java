import java.util.Scanner;

/*
-->Criar um vetor A com 10 elementos inteiros.
-->Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
ser o resto da divisão do respectivos elemento de A por 2, ou seja,
 B[i] = A[i] % 2

*/
public class Ex10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Entre com o valor do vetor A da posicao: " + i);
            vetorA[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Entre com o valor do vetor B da posicao: " + i);
            vetorB[i] = sc.nextInt();

            vetorB[i] = vetorA[i] % 2;
        }

        System.out.println("Vetor A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println(vetorA[i]);
        }

        System.out.println("Vetor B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

    }
}
