import java.util.ArrayList;
import java.util.List;

public class MyGraph<T> {
    private List<Vertex<T>> vertices = new ArrayList<>();

    public void addVertex(Vertex<T> vertex) {
        if (!vertices.contains(vertex)) {
            vertices.add(vertex);
        }
    }

    public List<Vertex<T>> getVertices() {
        return vertices;
    }
}
