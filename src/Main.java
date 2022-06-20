public class Main {
    public static void main (String[] args) {
        var tree = new Tree(0, null, null);
        Tree.addChilds(tree);

        System.out.printf("Depth-first traversal: %d%n", TreeTraversalDepthFirst.sum(tree));
        System.out.printf("Breadth-first traversal: %d%n", TreeTraversalBreadthFirst.sum(tree));
    }
}
