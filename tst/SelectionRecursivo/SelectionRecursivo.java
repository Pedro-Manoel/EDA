package questoes;

import java.util.Arrays;
import java.util.Scanner;

class SelectionRecursivo {

    public static void swap (int[] array, int posi01, int posi02) {
        int aux = array[posi01];
        array[posi01] = array[posi02];
        array[posi02] = aux;
    }

    public static void recursiveSelectionSort (int[] array, int posiInicio) {
        if (posiInicio < array.length - 1) {
            int indexMenor = posiInicio;
            for (int i = 1 + posiInicio; i < array.length; i++) {
                if (array[i] < array[indexMenor]) {
                    indexMenor = i;
                }
            }
            swap(array, posiInicio, indexMenor);
            System.out.println(Arrays.toString(array));
            recursiveSelectionSort(array, posiInicio + 1);
        }
    }

    public static void main (String[] args) {
        int [] array =
                Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        recursiveSelectionSort(array, 0);
    }

}
