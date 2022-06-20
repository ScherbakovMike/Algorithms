import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class GraphTraversalDepthFirst {
    public static long sum (Graph vertex) {
        if(vertex.isVisited()) {
            return 0L;
        }
        long result = vertex.getValue();
        vertex.setVisited(true);
        //System.out.println(vertex.index);
        var notVisited = Arrays.stream(vertex.getOut()).filter(node -> !node.isVisited).toList();
        for (Graph node : notVisited) {
            result += sum(node);
        }
        return result;
    }
}
