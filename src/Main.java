public class Main {
    public static void main(String[] args) {
        MyGraph<String> graph = new MyGraph<>(false);

        Vertex<String> astana = new Vertex<>("Astana");
        Vertex<String> almaty = new Vertex<>("Almaty");
        Vertex<String> karaganda = new Vertex<>("Karaganda");
        Vertex<String> pavlodar = new Vertex<>("Pavlodar");

        graph.addEdge(astana, almaty, 2.0);
        graph.addEdge(astana, karaganda, 1.5);
        graph.addEdge(karaganda, pavlodar, 3.0);
        graph.addEdge(almaty, pavlodar, 4.0);

        System.out.println("Граф:");
        graph.printGraph();

        System.out.println("\nОбход в ширину (BFS) от Astana:");
        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        bfs.bfs(astana);

        System.out.println("\n\nАлгоритм Дейкстры от Astana:");
        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        var distances = dijkstra.dijkstra(astana);

        for (var entry : distances.entrySet()) {
            System.out.println("Расстояние до " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
