public class Main {
    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>(false);

        Vertex<String> a = new Vertex<>("A");
        Vertex<String> b = new Vertex<>("B");
        graph.addEdge(a, b, 1.0);

        graph.printGraph();
    }
}
