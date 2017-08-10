public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(25, "First element");

        binaryTree.addNode(15, "Second element");

        binaryTree.addNode(50, "Third element");

        System.out.println(binaryTree.findNode(50));

    }
}
