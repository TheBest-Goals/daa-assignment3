### Problem 1 - Number of Provinces (5 points)

Solve the [problem](https://leetcode.com/problems/number-of-provinces) using **DFS or BFS** approaches.

Save your solution to [src/Problem01.java](src/Problem01.java).

Add report to [REPORT.md](REPORT.md).

# Problem 01: Number of Provinces

## Problem
You are given `n` cities and an `n x n` matrix `isConnected`. 
- `isConnected[i][j] = 1` means city `i` and city `j` are directly connected.
- `isConnected[i][j] = 0` means they are not directly connected.

A **province** is a group of cities that are directly or indirectly connected to each other.
Return the total number of provinces.

---

## Example
**Input:** `isConnected = [[1,1,0],[1,1,0],[0,0,1]]`  
**Output:** `2`  

*Explanation:* Cities `0` and `1` are connected (Province 1). City `2` is isolated (Province 2). Total = 2.

---

## Solution Idea (DFS)
1. Treat cities as nodes and connections as edges in a graph.
2. Keep track of visited cities using a `boolean[] visited` array.
3. Loop through each city from `0` to `n - 1`:
   - If a city is **not visited**, we found a **new province**! Increment our count.
   - Run Depth-First Search (DFS) from this city to visit and mark all connected cities.

---

## Complexity
- **Time Complexity:** $O(n^2)$ — We check the $n \times n$ matrix to find connections.
- **Space Complexity:** $O(n)$ — For the `visited` array and recursion stack.
