package questoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class PredecessorBst {

    private static class Node {
        public Integer data;
        public Node left;
        public Node right;
        public Node parent;

        public Node (Integer data) {
            this.data = data;
            this.left = null;
            this.right = null;
            this.parent = null;
        }

        public Node () {
            this(null);
        }
    }

    private static class MyBst {
        private Node root;

        public MyBst () {
            this.root = new Node();
        }

        public void add (Integer value) {
            if (this.root.data == null)
                this.root.data = value;
            else
                this.addRecursive(this.root, value);
        }

        private void addRecursive (Node currentNode, Integer value) {
            if (value > currentNode.data)
                if (currentNode.right == null) {
                    Node newNode = new Node(value);
                    currentNode.right = newNode;
                    newNode.parent = currentNode;
                } else
                    this.addRecursive(currentNode.right, value);
            else
                if (currentNode.left == null) {
                    Node newNode = new Node(value);
                    currentNode.left = newNode;
                    newNode.parent = currentNode;
                } else
                    this.addRecursive(currentNode.left, value);
        }

        private Node search (Node currentNode, Integer value) {
            if (currentNode == null || currentNode.data.equals(value))
                return currentNode;
            else
                if (value > currentNode.data)
                    return this.search(currentNode.right, value);
                else
                    return this.search(currentNode.left, value);
        }

        private void pathMax (Node currentNode, List<Integer> path) {
            path.add(currentNode.data);
            if (currentNode.right != null)
                this.pathMax(currentNode.right, path);
        }

        public Integer[] pathPredecessor (Integer value) {
            List<Integer> path = new ArrayList<>();
            Node node = this.search(this.root, value);

            path.add(node.data);
            if (node.left != null)
                this.pathMax(node.left, path);
            else
                this.pathPredecessorRecursive(node.parent, value, path);

            return path.toArray(new Integer[0]);
        }

        private void pathPredecessorRecursive (Node currentNode, Integer value, List<Integer> path) {
            if (currentNode != null) {
                path.add(currentNode.data);
                if (currentNode.data >= value)
                    this.pathPredecessorRecursive(currentNode.parent, value, path);
            }
        }
    }

    public static void main (String[] args) {
        MyBst myBst = new MyBst();
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(myBst::add);
        System.out.println(Arrays.toString(myBst.pathPredecessor(scanner.nextInt())));
    }
}
