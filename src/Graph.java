import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Graph {
    int value;

    Graph[] out;
    boolean isVisited = false;
    public static List<Graph> vertexes = new ArrayList<>();
    public static int maxIndex = 0;
    int index;
    public Graph (int value, Graph[] out) {
        this.value = value;
        this.out = out;
        this.index = maxIndex++;
    }

    public boolean isVisited () {
        return isVisited;
    }

    public void setVisited (boolean visited) {
        isVisited = visited;
    }

    public int getValue () {
        return value;
    }

    public void setValue (int value) {
        this.value = value;
    }

    public Graph[] getOut () {
        return out;
    }

    public void setOut (Graph[] out) {
        this.out = out;
    }

    public static void addChilds (Graph vertex) {
        var random = new Random();

        var value = random.nextInt(10);
        var countOut = random.nextInt(6);
        vertex.setValue(value);

        vertex.setOut(new Graph[countOut]);

        for (int i = 0; i < countOut; i++) {
            boolean genNew = random.nextBoolean();
            if (genNew || Graph.vertexes.isEmpty()) {
                vertex.getOut()[i] = new Graph(0, null);
                vertexes.add(vertex.getOut()[i]);
                addChilds(vertex.getOut()[i]);
            } else {
                Graph linkedVertex;
                do {
                    linkedVertex = Graph.vertexes.get(random.nextInt(Graph.vertexes.size()));
                } while (linkedVertex == vertex.getOut()[i]);
                vertex.getOut()[i] = linkedVertex;
            }
        }
    }
}
