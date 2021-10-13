package questoes;

import java.util.Scanner;

class PilhaComArray {

    public static class Pilha {

        int[] pilha;
        int top;

        public Pilha (int capacidade) {
            this.pilha = new int[capacidade];
            this.top = -1;
        }

        public void push (int elemento) {
            if (this.isFull())
                throw new RuntimeException("full");

            this.pilha[++this.top] = elemento;
        }

        public int pop () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            return this.pilha[this.top--];
        }

        public int peek () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            return this.pilha[this.top];
        }

        public boolean isFull () {
            return this.top == this.pilha.length - 1;
        }

        public boolean isEmpty () {
            return this.top == -1;
        }

        @Override
        public String toString () {
            if (this.isEmpty())
                return "empty";

            String pilhaStr = "";
            for (int i = 0; i <= this.top; i++) 
                pilhaStr += this.pilha[i] + " ";
            
            return pilhaStr.trim();
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha(Integer.parseInt(scanner.nextLine()));

        label:
        while (true) {
            String[] comando = scanner.nextLine().split(" ");

            try {
                switch (comando[0]) {
                    case "end":
                        break label;
                    case "print":
                        System.out.println(pilha);
                        break;
                    case "push":
                        pilha.push(Integer.parseInt(comando[1]));
                        break;
                    case "pop":
                        pilha.pop();
                        break;
                    case "peek":
                        System.out.println(pilha.peek());
                        break;
                }
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
