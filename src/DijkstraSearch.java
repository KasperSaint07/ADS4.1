import java.util.*;

public class DijkstraSearch<T> {
    public Map<Vertex<T>, Double> dijkstra(Vertex<T> start) {
        Map<Vertex<T>, Double> distances = new HashMap<>();
        PriorityQueue<VertexDistance<T>> pq = new PriorityQueue<>();

        distances.put(start, 0.0);
        pq.add(new VertexDistance<>(start, 0.0));

        while (!pq.isEmpty()) {
            VertexDistance<T> current = pq.poll();
            Vertex<T> currentVertex = current.vertex;

            for (Map.Entry<Vertex<T>, Double> entry : currentVertex.getAdjacentVertices().entrySet()) {
                Vertex<T> neighbor = entry.getKey();
                double edgeWeight = entry.getValue();
                double newDist = distances.get(currentVertex) + edgeWeight;

                if (newDist < distances.getOrDefault(neighbor, Double.MAX_VALUE)) {
                    distances.put(neighbor, newDist);
                    pq.add(new VertexDistance<>(neighbor, newDist));
                }
            }
        }

        return distances;
    }

    private static class VertexDistance<T> implements Comparable<VertexDistance<T>> {
        Vertex<T> vertex;
        double distance;

        VertexDistance(Vertex<T> vertex, double distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        @Override
        public int compareTo(VertexDistance<T> other) {
            return Double.compare(this.distance, other.distance);
        }
    }
}
