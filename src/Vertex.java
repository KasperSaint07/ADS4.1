import java.util.HashMap;
import java.util.Map;

public class Vertex<T> {
    private T data;
    private Map<Vertex<T>, Double> adjacentVertices = new HashMap<>();

    public Vertex(T data) {
        this.data = data;
    }

    public void addAdjacentVertex(Vertex<T> dest, double weight) {
        adjacentVertices.put(dest, weight);
    }

    public Map<Vertex<T>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    public String toString() {
        return String.valueOf(data);
    }
}
