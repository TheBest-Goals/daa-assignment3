### Problem 10 - Course Schedule II (5 points)

Solve the [problem](https://leetcode.com/problems/course-schedule-ii/) using **Kahn**'s algorithm.

Save your solution to [src/Problem10.java](src/Problem10.java).

Add report to [REPORT.md](REPORT.md).



# Problem 10: Course Schedule II (Topological Sort)

## Problem Description
There are `numCourses` courses labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [a, b]` indicates that you must take course `b` before taking course `a`.

Return the ordering of courses you should take to finish all courses. If there are multiple valid answers, return any of them. If it is impossible to finish all courses (due to a cycle), return an empty array `[]`.

---

## Examples

### Example 1
```text
Input: numCourses = 2, prerequisites = [[1,0]]
Output: [0, 1]
Explanation: To take course 1, you must finish course 0 first. Order: [0, 1].
