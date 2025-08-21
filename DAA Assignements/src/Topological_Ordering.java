import java.util.*;

public class Topological_Ordering {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            int vertices = getValidIntegerInput(scanner, "Enter the number of vertices:");
            Map<String, Integer> labelToIndex = new HashMap<>();
            Map<Integer, String> indexToLabel = new HashMap<>();

            System.out.println("Enter the vertex labels:");
            for (int i = 0; i < vertices; i++) {
                String label = scanner.next();
                labelToIndex.put(label, i);
                indexToLabel.put(i, label);
            }

            int edges = getValidIntegerInput(scanner, "Enter the number of edges:");
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                graph.add(new ArrayList<>());
            }

            System.out.println("Enter the edges (from to):");
            for (int i = 0; i < edges; i++) {
                String from = scanner.next();
                String to = scanner.next();
                int fromIndex = labelToIndex.get(from);
                int toIndex = labelToIndex.get(to);
                graph.get(fromIndex).add(toIndex);
            }

            // Detect cycle in the graph
            boolean hasCycle = detectCycle(graph, vertices);
            if (hasCycle) {
                System.out.println("The graph has a cycle; topological sort is not possible.");
            } else {
                System.out.println("All possible topological orders:");
                List<String> allOrders = new ArrayList<>();
                boolean[] visited = new boolean[vertices];
                int[] inDegree = new int[vertices];
                for (List<Integer> neighbors : graph) {
                    for (int neighbor : neighbors) {
                        inDegree[neighbor]++;
                    }
                }
                List<Integer> currentOrder = new ArrayList<>();
                generateTopologicalOrders(graph, inDegree, visited, currentOrder, allOrders, indexToLabel);

                for (String order : allOrders) {
                    System.out.println(order);
                }
                System.out.println("Total number of orders: " + allOrders.size());
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static int getValidIntegerInput(Scanner scanner, String prompt) {
        int value;
        while (true) {
            try {
                System.out.println(prompt);
                value = scanner.nextInt();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static boolean detectCycle(List<List<Integer>> graph, int vertices) {
        boolean[] visited = new boolean[vertices];
        boolean[] recursionStack = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (isCyclic(graph, i, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isCyclic(List<List<Integer>> graph, int node, boolean[] visited, boolean[] recursionStack) {
        visited[node] = true;
        recursionStack[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor] && isCyclic(graph, neighbor, visited, recursionStack)) {
                return true;
            } else if (recursionStack[neighbor]) {
                return true;
            }
        }

        recursionStack[node] = false;
        return false;
    }

    public static void generateTopologicalOrders(
            List<List<Integer>> graph, int[] inDegree, boolean[] visited,
            List<Integer> currentOrder, List<String> allOrders, Map<Integer, String> indexToLabel
    ) {
        boolean allVisited = true;

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && inDegree[i] == 0) {
                allVisited = false;
                visited[i] = true;
                currentOrder.add(i);

                for (int neighbor : graph.get(i)) {
                    inDegree[neighbor]--;
                }

                generateTopologicalOrders(graph, inDegree, visited, currentOrder, allOrders, indexToLabel);

                visited[i] = false;
                currentOrder.remove(currentOrder.size() - 1);
                for (int neighbor : graph.get(i)) {
                    inDegree[neighbor]++;
                }
            }
        }

        if (allVisited) {
            StringBuilder order = new StringBuilder();
            for (int node : currentOrder) {
                order.append(indexToLabel.get(node)).append(" ");
            }
            allOrders.add(order.toString().trim());
        }
    }
}