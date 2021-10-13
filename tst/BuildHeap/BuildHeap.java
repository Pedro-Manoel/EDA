package questoes;

import java.util.Arrays;
import java.util.Scanner;

class BuildHeap {

    private static boolean isValidIndex (int index, int[] array) {
        return index >= 0 && index <= array.length - 1;
    }

    private static void swap (int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    private static void heapify (int index, int[] array) {
        int
                iLeft = (2 * index) + 1,
                iRight = 2 * (index + 1),
                largest = index;

        if (isValidIndex(iLeft, array) && array[iLeft] > array[index])
            largest = iLeft;
        if (isValidIndex(iRight, array) && array[iRight] > array[largest])
            largest = iRight;
        if (largest != index) {
            swap(array, index, largest);
            heapify(largest, array);
        }
    }

    public static void buildHeap (int[] array) {
        for (int i = array.length / 2; i >= 0; i--)
            heapify(i, array);
    }

    public static void main (String[] args) {
        int[] array = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        buildHeap(array);
        System.out.println(Arrays.toString(array));
    }

}
