// WAP to count the degree of each vertex in a directed Graph (where graph is created using
// edges means if user input 1 2 then there is a directed edge from node 1 to node 2 user enter
// -1 for stop entering the edge)


import java.util.*;

public class P50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Maps to store in-degree and out-degree
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, Integer> outDegree = new HashMap<>();

        System.out.println("Enter edges (format: from to), enter -1 to stop:");

        while (true) {
            int from = sc.nextInt();
            if (from == -1) {
                break;
            }
            int to = sc.nextInt();

            // Update out-degree
            outDegree.put(from, outDegree.getOrDefault(from, 0) + 1);

            // Update in-degree
            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);

            // Also make sure each node appears in both maps
            inDegree.putIfAbsent(from, inDegree.getOrDefault(from, 0));
            outDegree.putIfAbsent(to, outDegree.getOrDefault(to, 0));
        }

        sc.close();

        // Display degrees
        System.out.println("\nVertex\tIn-Degree\tOut-Degree");
        Set<Integer> vertices = new HashSet<>();
        vertices.addAll(inDegree.keySet());
        vertices.addAll(outDegree.keySet());

        for (int vertex : vertices) {
            System.out.println(vertex + "\t\t" + inDegree.get(vertex) + "\t\t" + outDegree.get(vertex));
        }
    }
}