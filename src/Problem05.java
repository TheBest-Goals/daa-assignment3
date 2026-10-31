package src;

import java.util.*;

public class Problem05 {

    public int countDependencyGroups(int n, int[][] dependencies) {
        if (n <= 0) {
            return 0;
        }

        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            transpose.add(new ArrayList<>());
        }

        for (int[] dep : dependencies) {
            int u = dep[0];
            int v = dep[1];
            adj.get(u).add(v);
            transpose.get(v).add(u); 
        }

        boolean[] visited = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs1(i, adj, visited, stack);
            }
        }

        Arrays.fill(visited, false);
        int sccCount = 0;

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                sccCount++;
                dfs2(node, transpose, visited);
            }
        }

        return sccCount;
    }

    private void dfs1(int node, List<List<Integer>> adj, boolean[] visited, Deque<Integer> stack) {
        visited[node] = true;
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs1(neighbor, adj, visited, stack);
            }
        }
        stack.push(node); 
    }

    private void dfs2(int node, List<List<Integer>> transpose, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : transpose.get(node)) {
            if (!visited[neighbor]) {
                dfs2(neighbor, transpose, visited);
            }
        }
    }
}
