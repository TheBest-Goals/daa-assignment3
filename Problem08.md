### Problem 8 - Course Schedule (5 points)

Solve the [problem](https://leetcode.com/problems/course-schedule/) using **Kahn**'s approach.

Save your solution to [src/Problem08.java](src/Problem08.java).

Add report to [REPORT.md](REPORT.md).



# Problem 08: Course Schedule (Cycle Detection / Topological Sort)

## Problem Description
There are `numCourses` courses labeled from `0` to `numCourses - 1`. You are given an array `prerequisites` where `prerequisites[i] = [a, b]` indicates that you must take course `b` before taking course `a`.

Return `true` if you can finish all courses; otherwise, return `false`.

---

## Examples

### Example 1
```text
Input: numCourses = 2, prerequisites = [[1,0]]
Output: true
Explanation: To take course 1, you finish course 0 first. Possible.
