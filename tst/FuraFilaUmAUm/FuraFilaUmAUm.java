package questoes;

import java.util.Arrays;
import java.util.Scanner;

class FuraFilaUmAUm {

    public static void swap (int[] array, int posi01, int posi02) {
        int aux = array[posi01];
        array[posi01] = array[posi02];
        array[posi02] = aux;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

        int index = scanner.nextInt();
        for (int i = index; i < array.length; i++) {
            for (int j = i; j > i - index; j--) {
                swap(array, j, j - 1);
            }
            System.out.println(Arrays.toString(array));
        }
    }

}
