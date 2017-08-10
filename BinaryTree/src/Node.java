public class Node {

    int value;
    String name;

    Node left;
    Node right;

    Node(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public String toString() {
        return name + " has the value " + value;
    }
}