### Problem 2 - Number of Provinces (5 points)

Solve the [problem](https://leetcode.com/problems/number-of-provinces) using **Disjoint Set Union** data structure.

Save your solution to [src/Problem02.java](src/Problem02.java).

Add report to [REPORT.md](REPORT.md).


# Problem 02: Graph Traversal / Connected Components

## Overview
This directory contains the implementation for Problem 02. The task requires traversing an undirected graph or processing adjacency matrices/lists to analyze connected paths and relationships.

---

## Files
- `src/Problem02.java` — Solution implementation.
- `REPORT.md` — Complexity analysis and approach documentation.

---

## Approach
1. **Model the Data**: Represent relationships as nodes and edges using an adjacency list or matrix.
2. **Traversal**: Apply **DFS** (Depth-First Search) or **BFS** (Breadth-First Search) to visit all reachable nodes from an unvisited starting point.
3. **Tracking State**: Use a `visited` array to prevent infinite loops and ensure each component/node is processed once.

---

## Complexity Analysis
- **Time Complexity:** $O(V + E)$ or $O(N^2)$ depending on matrix vs adjacency list representation.
- **Space Complexity:** $O(V)$ for the `visited` array and recursion/queue storage.
