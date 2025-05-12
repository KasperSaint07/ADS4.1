import java.util.ArrayList;
import java.util.List;

public class MyGraph<T> {
    private List<Vertex<T>> vertices = new ArrayList<>();
    private boolean directed;

    public void addVertex(Vertex<T> vertex) {
        if (!vertices.contains(vertex)) {
            vertices.add(vertex);
        }
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }


    public MyGraph(boolean directed) {
        this.directed = directed;
    }

    public void addEdge(Vertex<T> source, Vertex<T> destination, double weight) {
        addVertex(source);
        addVertex(destination);
        source.addAdjacentVertex(destination, weight);
        if (!directed) {
            destination.addAdjacentVertex(source, weight);
        }
    }

}
