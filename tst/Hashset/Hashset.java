package questoes;

import java.util.Arrays;
import java.util.Scanner;

class Hashset {

    private static class MyHashSet {

        private static class DELETED {
            @Override
            public String toString () { return "null"; }
        }

        private static final DELETED deleted = new DELETED();
        private Object[] table;
        private int size;

        public MyHashSet (int capacity) {
            this.table = new Object[capacity];
            this.size = 0;
        }

        private int hash (int key, int probe) {
            return ((key % this.table.length) + probe) % this.table.length;
        }

        public void put (int value) {
            if (!this.isFull()) {
                int probe = 0;
                 while (probe < this.table.length) {
                     int hash = this.hash(value, probe);
                     if (this.table[hash] == null || this.table[hash].equals(deleted)) {
                         this.table[hash] = value;
                         this.size++;
                         break;
                     } else if (this.table[hash].equals(value))
                         break;
                     probe++;
                 }
            }
        }

        public void remove (int value) {
            int index = this.indexOf(value);
            if (index != -1) {
                this.table[index] = deleted;
                this.size--;
            }
        }

        public boolean contains (int value) {
            return this.indexOf(value) != -1;
        }

        public int indexOf (int value) {
            if (!this.isEmpty()) {
                int probe = 0;
                while (probe < this.table.length) {
                    int hash = this.hash(value, probe);
                    if (this.table[hash] != null) {
                        if (this.table[hash].equals(value))
                            return hash;
                        probe++;
                    } else
                        return -1;
                }
                return -1;
            }
            return -1;
        }

        public boolean isFull () {
            return this.size == this.table.length;
        }

        public boolean isEmpty () {
            return this.size == 0;
        }

        @Override
        public String toString () {
            return Arrays.toString(this.table);
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyHashSet myHashSet = new MyHashSet(Integer.parseInt(scanner.nextLine()));

        label:
        while (true) {
            String[] command = scanner.nextLine().split(" ");

            switch (command[0]) {
                case "end":
                    break label;
                case "put":
                    myHashSet.put(Integer.parseInt(command[1]));
                    System.out.println(myHashSet);
                    break;
                case "remove":
                    myHashSet.remove((Integer.parseInt(command[1])));
                    System.out.println(myHashSet);
                    break;
                case "contains":
                    System.out.println(myHashSet.contains((Integer.parseInt(command[1]))));
                    break;
            }
        }
    }

}
