public class Problem03 {
    public int minCostConnectPoints(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        int n = points.length;
        int totalCost = 0;
        boolean[] inMST = new boolean[n];
        int[] minDist = new int[n];

        for (int i = 0; i < n; i++) {
            minDist[i] = Integer.MAX_VALUE;
        }

        minDist[0] = 0;

        for (int step = 0; step < n; step++) {
            int curr = -1;

            for (int i = 0; i < n; i++) {
                if (!inMST[i] && (curr == -1 || minDist[i] < minDist[curr])) {
                    curr = i;
                }
            }

            inMST[curr] = true;
            totalCost += minDist[curr];

            for (int next = 0; next < n; next++) {
                if (!inMST[next]) {
                    int dist = Math.abs(points[curr][0] - points[next][0])
                             + Math.abs(points[curr][1] - points[next][1]);
                    if (dist < minDist[next]) {
                        minDist[next] = dist;
                    }
                }
            }
        }

        return totalCost;
    }
}
