public class TreeTraversalDepthFirst {
    public static long sum (Tree node) {
        return node.value +
            (node.getLeft() == null ? 0L : sum(node.getLeft())) +
            (node.getRight() == null ? 0L : sum(node.getRight()));
    }
}
