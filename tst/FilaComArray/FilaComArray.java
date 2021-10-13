package questoes;

import java.util.Scanner;

class FilaComArray {

    public static class Fila {

        int[] fila;
        int top;

        public Fila (int capacidade) {
            this.fila = new int[capacidade];
            this.top = -1;
        }

        public void add (int elemento) {
            if (this.isFull())
                throw new RuntimeException("full");

            this.fila[++this.top] = elemento;
        }

        public int remove () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            int element = this.element();
            this.shiftLeft();
            this.top--;
            return element;
        }

        public int element () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            return this.fila[0];
        }

        public boolean isFull () {
            return this.top == this.fila.length - 1;
        }

        public boolean isEmpty () {
            return this.top == -1;
        }

        private void shiftLeft () {
            for (int i = 0; i < this.top; i++)
                this.fila[i] = this.fila[i + 1];
        }

        @Override
        public String toString () {
            if (this.isEmpty())
                return "empty";

            String filaStr = "";
            for (int i = 0; i <= this.top; i++)
                filaStr += this.fila[i] + " ";

            return filaStr.trim();
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(Integer.parseInt(scanner.nextLine()));

        label:
        while (true) {
            String[] comando = scanner.nextLine().split(" ");

            try {
                switch (comando[0]) {
                    case "end":
                        break label;
                    case "print":
                        System.out.println(fila);
                        break;
                    case "add":
                        fila.add(Integer.parseInt(comando[1]));
                        break;
                    case "remove":
                        fila.remove();
                        break;
                    case "element":
                        System.out.println(fila.element());
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
