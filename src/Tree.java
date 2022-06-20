import java.util.Random;

public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree (int value, Tree left, Tree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue () {
        return value;
    }

    public Tree getLeft () {
        return left;
    }

    public Tree getRight () {
        return right;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public void setLeft (Tree left) {
        this.left = left;
    }

    public void setRight (Tree right) {
        this.right = right;
    }

    public static void addChilds (Tree node) {
        var random = new Random();

        var value = random.nextInt(10);
        var hasLeft = random.nextBoolean();
        var hasRight = random.nextBoolean();
        node.setValue(value);
        if (hasLeft) {
            node.setLeft(new Tree(0, null, null));
            addChilds(node.getLeft());
        }
        if (hasRight) {
            node.setRight(new Tree(0, null, null));
            addChilds(node.getRight());
        }
    }
}
