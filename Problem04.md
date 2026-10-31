### Problem 4 - Min Cost To Connect All Points (5 points)

Solve the [problem](https://leetcode.com/problems/min-cost-to-connect-all-points) using **Prim**'s algorithm.

Save your solution to [src/Problem04.java](src/Problem04.java).

Add report to [REPORT.md](REPORT.md).

# Problem 04: Min Cost to Connect All Points

## Problem Description
You are given an array `points` representing integer coordinates of points on a 2D-plane, where `points[i] = [xi, yi]`.

The cost of connecting two points `[xi, yi]` and `[xj, yj]` is the **Manhattan distance** between them:
$$\text{Cost} = \vert{}x_i - x_j\vert{} + \vert{}y_i - y_j\vert{}$$

Return the minimum cost to make all points connected such that there is exactly one simple path between any pair of points (Minimum Spanning Tree).

---

## Examples

### Example 1
```text
Input: points = [[0,0],[2,2],[3,10],[5,2],[7,0]]
Output: 20
