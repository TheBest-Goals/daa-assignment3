### Problem 7 - Course Schedule (5 points)

Solve the [problem](https://leetcode.com/problems/course-schedule/) using **DFS** approach.

Save your solution to [src/Problem07.java](src/Problem07.java).

Add report to [REPORT.md](REPORT.md).


# Problem 07: Course Schedule (Cycle Detection / Topological Sort)

## Problem Description
There are `numCourses` courses labeled `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [a, b]` indicates that you must take course `b` before taking course `a`.

Return `true` if you can finish all courses. Otherwise, return `false`.

---

## Examples

### Example 1
```text
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: To take course 1, you finish course 0 first. Possible.
