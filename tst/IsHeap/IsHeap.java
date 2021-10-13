package questoes;

import java.util.Arrays;
import java.util.Scanner;

class IsHeap {

    private static boolean isValidIndex (int index, int[] array) {
        return index >= 0 && index <= array.length - 1;
    }

    private static boolean isMaxHeap (int[] array, int index) {
        int
                iLeft = (2 * index) + 1,
                iRight = 2 * (index + 1);

        if (isValidIndex(iLeft, array) && isValidIndex(iRight, array))
            if (array[index] > array[iLeft] && array[index] > array[iRight])
                return isMaxHeap(array, iLeft) && isMaxHeap(array, iRight);
            else
                return false;
        else
            return true;
    }

    public static boolean isMaxHeap (int[] array) {
        return isMaxHeap(array, 0);
    }

    public static void main (String[] args) {
        int[] array = Arrays.stream(new Scanner(System.in).nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(isMaxHeap(array));
    }

}
