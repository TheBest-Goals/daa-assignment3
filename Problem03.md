### Problem 3 - Min Cost To Connect All Points (5 points)

Solve the [problem](https://leetcode.com/problems/min-cost-to-connect-all-points) using **Kruskal**'s algorithm.

Save your solution to [src/Problem03.java](src/Problem03.java).

Add report to [REPORT.md](REPORT.md).


# Problem 03: Min Cost to Connect All Points

## Problem Statement
Given an array `points` representing integer coordinates on a 2D plane:
- The cost to connect two points `[xi, yi]` and `[xj, yj]` is their **Manhattan distance**: $|x_i - x_j| + |y_i - y_j|$.
- Return the **minimum cost** to connect all points such that there is exactly one simple path between any pair of points.

---

## Example
**Input:** `points = [[0,0],[2,2],[3,10],[5,2],[7,0]]`  
**Output:** `20`

---

## Algorithm & Complexity
This is a **Minimum Spanning Tree (MST)** problem on a dense graph ($E \approx \frac{N^2}{2}$).

Using **Prim's Algorithm** (without a binary heap):
- **Time Complexity:** $\mathcal{O}(N^2)$ — Ideal for $N \le 1000$.
- **Space Complexity:** $\mathcal{O}(N)$ — Storage for `minDist` and `inMST` arrays.

