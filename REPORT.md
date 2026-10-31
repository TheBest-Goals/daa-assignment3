### DAA Assignment3 - Report and Defense (50 points)

## Problem 1 and 2 - Number of Provinces (10 points)

### Problem Description
Given an `n x n` matrix `isConnected` representing direct connections between cities, determine the total number of connected components (provinces).

### Approach & Strategy
We model the cities as vertices in an undirected graph. We use **Depth-First Search (DFS)** to traverse connected components:
1. Maintain a `visited` boolean array of size `n`.
2. Iterate through all cities `0` to `n - 1`.
3. If an unvisited city is encountered, increment the `provinces` counter and run DFS to mark all transitively connected cities.

### Complexity Analysis
- **Time Complexity:** $\mathcal{O}(N^2)$ — We check every entry in the $N \times N$ matrix `isConnected`.
- **Space Complexity:** $\mathcal{O}(N)$ — For the `visited` array and recursion call stack.

---

## Problem 3 and 4 - Min Cost Spanning Tree (10 points)

### Problem Description
Given 2D coordinates of `n` points, find the minimum cost to connect all points. The cost of an edge between two points is their **Manhattan distance**: $|x_1 - x_2| + |y_1 - y_2|$.

### Approach & Strategy
This is a **Minimum Spanning Tree (MST)** problem on a complete dense graph ($E \approx \frac{N^2}{2}$). We use **Prim's Algorithm**:
1. Start with an arbitrary node (node `0`) and set its distance to `0`.
2. Track minimum distances to the current MST using a `minDist` array.
3. At each step, pick the unvisited node with the smallest `minDist`, add it to the MST, and update `minDist` for remaining unvisited nodes.

### Complexity Analysis
- **Time Complexity:** $\mathcal{O}(N^2)$ — Optimal for dense graphs without needing a priority queue overhead.
- **Space Complexity:** $\mathcal{O}(N)$ — To store `minDist` and `inMST` state arrays.

---

## Problem 5 and 6 - Software Dependency Cycles (10 points)

### Problem Description
Given `n` software modules and directed dependencies `[a, b]` ($a$ depends on $b$), count the number of circular dependency groups (Strongly Connected Components).

### Approach & Strategy
- **Problem 05 (Kosaraju's Algorithm)**:
  1. Perform a 1st DFS pass on the graph to order nodes by finish times using a stack.
  2. Transpose the directed graph $G^T$.
  3. Perform a 2nd DFS pass on $G^T$ popping from the stack to count individual SCCs.
- **Problem 06 (Tarjan's Algorithm)**:
  1. Perform a single DFS pass using `ids` (discovery time) and `low` link values.
  2. Maintain an explicit stack of visited nodes. When `ids[u] == low[u]`, pop the SCC from the stack and increment the count.

### Complexity Analysis
- **Time Complexity:** $\mathcal{O}(V + E)$ — Linear traversal of all vertices ($N$) and dependency links ($M$).
- **Space Complexity:** $\mathcal{O}(V + E)$ — For adjacency lists, recursion stack, and metadata arrays (`ids`, `low`, `visited`).

---

## Problem 7 and 8 - Course Schedule (10 points)

### Problem Description
Determine if it is possible to complete all `numCourses` given a list of prerequisites `[a, b]` ($b \to a$). Return `true` if all courses can be finished, or `false` if a dependency cycle exists.

### Approach & Strategy
We use **Kahn's Algorithm (BFS Topological Sort)**:
1. Compute in-degrees (number of prerequisites) for each course.
2. Push all courses with `inDegree == 0` into a queue.
3. Process the queue while decrementing in-degrees of neighbor courses.
4. If total processed courses equal `numCourses`, no cycle exists.

### Complexity Analysis
- **Time Complexity:** $\mathcal{O}(V + E)$ — Where $V = \text{numCourses}$ and $E = \text{prerequisites.length}$.
- **Space Complexity:** $\mathcal{O}(V + E)$ — For adjacency list, `inDegree` array, and queue.

---

## Problem 9 and 10 - Course Schedule II (10 points)

### Problem Description
Return a valid ordering of courses to finish all `numCourses`. If a cycle exists making it impossible, return an empty array `[]`.

### Approach & Strategy
We extend **Kahn's Algorithm (BFS Topological Sort)**:
1. Build an adjacency list and in-degree array for prerequisites.
2. Initialize a queue with all courses that have `inDegree == 0`.
3. Pop from the queue and record courses into an `order` array.
4. Decrement neighbors' in-degrees and enqueue any neighbor whose in-degree drops to `0`.
5. Return the `order` array if its length equals `numCourses`; otherwise, return `[]`.

### Complexity Analysis
- **Time Complexity:** $\mathcal{O}(V + E)$ — Traverses each vertex and directed edge once.
- **Space Complexity:** $\mathcal{O}(V + E)$ — For the adjacency list, queue, and result array.
