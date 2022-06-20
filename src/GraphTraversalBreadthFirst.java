import java.util.Arrays;
import java.util.LinkedList;

public class GraphTraversalBreadthFirst {
    public static long sum (Graph vertex) {
        Graph.vertexes.forEach(item -> item.isVisited = false);

        long result = 0L;
        var queue = new LinkedList<Graph>();
        queue.push(vertex);
        while (!queue.isEmpty()) {
            var node = queue.pop();
            if(!node.isVisited()) {
                node.setVisited(true);
                //System.out.println(node.index);
                result += node.getValue();
            }
            var notVisited = Arrays.stream(node.getOut()).filter(item -> !item.isVisited).toList();
            notVisited.forEach(queue::push);
        }
        return result;
    }
}
