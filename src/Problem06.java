package src;

import java.util.*;

public class Problem06 {

    private int timer = 0;
    private int sccCount = 0;

    public int countDependencyGroups(int n, int[][] dependencies) {
        if (n <= 0) {
            return 0;
        }

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] dep : dependencies) {
            adj.get(dep[0]).add(dep[1]);
        }

        int[] ids = new int[n];
        int[] low = new int[n];
        boolean[] onStack = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.fill(ids, -1);

        timer = 0;
        sccCount = 0;

        for (int i = 0; i < n; i++) {
            if (ids[i] == -1) {
                dfs(i, adj, ids, low, onStack, stack);
            }
        }

        return sccCount;
    }

    private void dfs(int u, List<List<Integer>> adj, int[] ids, int[] low, boolean[] onStack, Deque<Integer> stack) {
        ids[u] = low[u] = timer++;
        stack.push(u);
        onStack[u] = true;

        for (int v : adj.get(u)) {
            if (ids[v] == -1) {
                dfs(v, adj, ids, low, onStack, stack);
                low[u] = Math.min(low[u], low[v]);
            } else if (onStack[v]) {
                low[u] = Math.min(low[u], ids[v]);
            }
        }

        if (ids[u] == low[u]) {
            while (true) {
                int node = stack.pop();
                onStack[node] = false;
                if (node == u) {
                    break;
                }
            }
            sccCount++;
        }
    }
}
