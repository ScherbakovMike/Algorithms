public class Main {
    public static void main (String[] args) {
        var tree = new Tree(0, null, null);
        Tree.addChilds(tree);

        System.out.println("Trees:");
        System.out.printf("Depth-first traversal: %d%n", TreeTraversalDepthFirst.sum(tree));
        System.out.printf("Breadth-first traversal: %d%n", TreeTraversalBreadthFirst.sum(tree));

        var graph = new Graph(0, null);
        Graph.vertexes.add(graph);
        Graph.addChilds(graph);

        System.out.println("Graphs:");
        System.out.printf("Depth-first traversal: %d%n", GraphTraversalDepthFirst.sum(graph));

        System.out.printf("Breadth-first traversal: %d%n", GraphTraversalBreadthFirst.sum(graph));
    }
}
