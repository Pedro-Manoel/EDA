package questoes;

import java.util.Arrays;
import java.util.Scanner;

class CountingSortNegativos {

    public static int[] converteArrayStringEmInt (String[] array) {
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        return arrayInt;
    }

    public static void countingSort (int[] A, int k, int menorValor) {
        int[] C = new int[k - menorValor + 1];
        int[] B = new int[A.length];

        // Frequência
        for (int j : A) {
            C[j - menorValor]++;
            System.out.println(Arrays.toString(C));
        }

        // Cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }
        System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(C));

        // Preenchendo B
        for (int i = A.length - 1; i >= 0; i--) {
            B[C[A[i] - menorValor] - 1] = A[i];
            C[A[i] - menorValor]--;
        }
        System.out.println(Arrays.toString(C) + "\n" + Arrays.toString(B));
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = converteArrayStringEmInt(scanner.nextLine().split(" "));
        int maiorValor = scanner.nextInt();
        int menorValor = scanner.nextInt();

        countingSort(array, maiorValor, menorValor);
    }

}