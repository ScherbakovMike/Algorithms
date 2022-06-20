import java.util.LinkedList;

public class TreeTraversalBreadthFirst {
    public static long sum (Tree node) {
        var queue = new LinkedList<Tree>();
        queue.push(node);

        long result = 0L;
        while (!queue.isEmpty()) {
            var next = queue.pop();
            result += next.getValue();
            if (next.getLeft() != null) {
                queue.push(next.getLeft());
            }
            if (next.getRight() != null) {
                queue.push(next.getRight());
            }
        }
        return result;
    }
}
