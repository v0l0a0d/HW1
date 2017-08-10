public class BinaryTree {

    Node root;

    public void addNode(int value, String name) {

        Node newNode = new Node(value, name);

        if (root == null) {
            root = newNode;

        } else {
            Node focusNode = root;
            Node parent;

            while (true) {
                parent = focusNode;

                if (value < focusNode.value) {
                    focusNode = focusNode.left;

                    if (focusNode == null) {
                        parent.left = newNode;
                        return;
                    }

                } else {
                    focusNode = focusNode.right;

                    if (focusNode == null) {
                        parent.right = newNode;
                        return;

                    }

                }

            }
        }

    }


    public Node findNode(int value) {

        Node focusNode = root;

        while (focusNode.value != value) {

            if (value < focusNode.value) {
                focusNode = focusNode.left;

            } else {
                focusNode = focusNode.right;
            }

            if (focusNode == null)
                return null;

        }

        return focusNode;

    }

}