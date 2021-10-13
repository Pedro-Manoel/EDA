package questoes;

import java.util.Arrays;
import java.util.Scanner;

class InsereOrdenadoUltimo {

    public static void swap (int[] array, int posi01, int posi02) {
        int aux = array[posi01];
        array[posi01] = array[posi02];
        array[posi02] = aux;
    }

    public static void main (String[] args) {
        int [] array =
                Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int i = array.length - 1;
        while (i > 0 && array[i] < array[i - 1]) {
            swap(array, i, i - 1);
            i -= 1;
        }
        System.out.println(Arrays.toString(array));
    }

}
