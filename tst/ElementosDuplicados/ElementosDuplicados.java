package questoes;

import java.util.Scanner;

class ElementosDuplicados {

    public static void main(String[] args) {
        String[] elementos = new Scanner(System.in).nextLine().split(" ");

        for (int i1 = 0; i1 < elementos.length; i1++) {
            for (int i2 = i1 + 1; i2 < elementos.length; i2++) {
                if (elementos[i1].equals(elementos[i2])) {
                    System.out.print("true\n");
                    return;
                }
            }
        }

        System.out.print("false\n");
    }
}
