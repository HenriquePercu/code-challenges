class Node {
    private Node leftChild, rightChild;

    public Node(Node leftChild, Node rightChild) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        return getHeightRecursively(this, 0);
    }

    private int getHeightRecursively(Node currentNode, int height) {
        int leftHeight = 0;
        int rightHeight = 0;

        if (currentNode.getLeftChild() != null) {
            leftHeight = getHeightRecursively(currentNode.getLeftChild(), height + 1);
        }

        if (currentNode.getRightChild() != null) {
            rightHeight = getHeightRecursively(currentNode.getRightChild(), height + 1);
        }

        return Math.max(height, Math.max(leftHeight, rightHeight));
    }


    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node2 = new Node(leaf1, null);
        Node node = new Node(node2, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}