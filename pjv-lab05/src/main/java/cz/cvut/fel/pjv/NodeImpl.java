package cz.cvut.fel.pjv;

public class NodeImpl implements Node {

    private int value;
    private Node left;
    private Node right;

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public NodeImpl(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
    public int getValue() {
        return value;
    }
    public String toString() {

        return " "+Integer.toString(this.value);
    }
}
