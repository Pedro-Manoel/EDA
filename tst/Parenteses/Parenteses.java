package questoes;

import java.util.Scanner;

class Parenteses {

    private static class Node {
        public String data;
        public Node next;
        public Node prev;

        public Node (String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static class Pilha {
        private Node top;

        public Pilha () {
            this.top = null;
        }

        public void push (String element) {
            if (this.isEmpty())
                this.top = new Node(element);
            else {
                Node newNode = new Node(element);
                newNode.next = this.top;
                this.top.prev = newNode;
                this.top = newNode;
            }
        }

        public String pop ()  {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            String element = this.top.data;
            this.top = this.top.next;
            if (this.top != null)
                this.top.prev = null;
            return element;
        }

        public boolean isEmpty () {
            return this.top == null;
        }

    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parenteses = scanner.nextLine().split("");
        Pilha pilha = new Pilha();

        for (String parentese : parenteses) {
            if (parentese.equals("("))
                pilha.push(parentese);
            else {
                if (pilha.isEmpty()) {
                    System.out.println("N");
                    return;
                } else
                    pilha.pop();
            }
        }

        if (pilha.isEmpty())
            System.out.println("S");
        else
            System.out.println("N");
    }

}
