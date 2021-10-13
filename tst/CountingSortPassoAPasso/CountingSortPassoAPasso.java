package questoes;

import java.util.Arrays;
import java.util.Scanner;

class CountingSortPassoAPasso {

    public static int[] converteArrayStringEmInt (String[] array) {
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        return arrayInt;
    }

    public static String toStringArray (int[] array) {
        String arrayStr = Arrays.toString(array).replaceAll(",", "");
        return arrayStr.substring(1, arrayStr.length() - 1);
    }

    public static void countingSort (int[] A, int k) {
        int[] C = new int[k + 1];
        int[] B = new int[A.length];

        // Frequência
        for (int j : A) {
            C[j]++;
            System.out.println(toStringArray(C));
        }

        // Cumulativa
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }
        System.out.println("Cumulativa do vetor de contagem - " + toStringArray(C));

        // Preenchendo B
        for (int i = A.length - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]]--;
        }
        System.out.println(toStringArray(C) + "\n" + toStringArray(B));
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = converteArrayStringEmInt(scanner.nextLine().split(" "));
        int maiorValor = scanner.nextInt();

        countingSort(array, maiorValor);
    }

}
