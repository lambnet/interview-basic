package util.trees;

public class Main {
    public static void main(String[] args) {
        Node trees = new Node(25);
        trees.insert(15);
        trees.insert(10);
        trees.insert(4);
        trees.insert(12);
        trees.insert(22);
        trees.insert(18);
        trees.insert(24);
        trees.insert(50);
        trees.insert(70);
        trees.insert(35);
        trees.insert(31);
        trees.insert(44);
        trees.insert(66);
        trees.insert(90);

        trees.printInorder();
        //trees.printPreorder();
        //trees.printPostorder();
    }
}
