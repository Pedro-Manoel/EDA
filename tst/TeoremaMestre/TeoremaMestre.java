package questoes;

import java.util.Scanner;

class TeoremaMestre {

    public static double log (double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }

    public static void main (String[] args) {
        String[] entrada = new Scanner(System.in).nextLine().split(" ");
        int a = Integer.parseInt(entrada[0]);
        int b = Integer.parseInt(entrada[1]);
        int ord = Integer.parseInt(entrada[2]);

        if (ord > log(b, a)) {
            System.out.format("T(n) = theta(n**%d)\n", ord);
        } else {
            System.out.format("T(n) = theta(n**%d * log n)\n", (int) log(b, a));
        }
    }
}
