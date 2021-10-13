package questoes;

import java.util.Scanner;

class BuscaBinariaRecursiva {

    public static int[] converteArrayStringEmInt (String[] array) {
        int[] arrayInt = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayInt[i] = Integer.parseInt(array[i]);
        }

        return arrayInt;
    }

    public static int buscaBinaria (int[] array, int num, int inicio, int fim) {

        if (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            System.out.println(meio);

            if (array[meio] == num) {
                return meio;
            } else if (array[meio] < num) {
                return buscaBinaria(array, num, meio + 1, fim);
            } else if (array[meio] > num) {
                return buscaBinaria(array, num, inicio, meio - 1);
            }
        }

        System.out.println(-1);
        return -1;
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = converteArrayStringEmInt(scanner.nextLine().split(" "));
        int num = scanner.nextInt();

        buscaBinaria(array, num, 0, array.length - 1);
    }
}
