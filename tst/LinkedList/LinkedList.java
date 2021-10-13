package questoes;

import java.util.Scanner;

class LinkedList {

    private static class Node {
        public Integer data;
        public Node next;
        public Node prev;

        public Node (Integer data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static class Fila {
        private Node head;

        public Fila () {
            this.head = null;
        }

        public void add (int element) {
            if (this.isEmpty())
                this.head = new Node(element);
            else
                this.addRecursive(this.head, element);
        }

        private void addRecursive (Node currentNode, int element) {
            if (currentNode.next == null){
                Node newNode = new Node(element);
                currentNode.next = newNode;
                newNode.prev = currentNode;
            } else
                this.addRecursive(currentNode.next, element);
        }

        public int remove () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            int element = this.element();
            this.head = this.head.next;
            if (this.head != null)
                this.head.prev = null;
            return element;
        }

        public int search (int element) {
            return this.searchRecursive(this.head, element, 0);
        }

        private int searchRecursive (Node currentNode, int element, int index) {
            if (currentNode != null) {
                if (currentNode.data == element)
                    return index;
                return this.searchRecursive(currentNode.next, element, ++index);
            } else
                return -1;
        }

        public int element () {
            if (this.isEmpty())
                throw new RuntimeException("empty");

            return this.head.data;
        }

        public boolean isEmpty () {
            return this.head == null;
        }

        @Override
        public String toString () {
            if (this.isEmpty())
                return "empty";
            if (this.head.next == null)
                return String.valueOf(this.head.data);

            return this.toStringRecursive(this.head);
        }

        private String toStringRecursive (Node currentNode) {
            if (currentNode != null)
                return currentNode.data +" "+ this.toStringRecursive(currentNode.next).trim();
            else
                return "";
        }

    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila();

        label:
        while (true) {
            String[] command = scanner.nextLine().split(" ");

            try {
                switch (command[0]) {
                    case "end":
                        break label;
                    case "print":
                        System.out.println(fila);
                        break;
                    case "add":
                        fila.add(Integer.parseInt(command[1]));
                        break;
                    case "remove":
                        fila.remove();
                        break;
                    case "search":
                        System.out.println(fila.search(Integer.parseInt(command[1])));
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
