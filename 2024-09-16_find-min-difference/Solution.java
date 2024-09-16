import java.util.Arrays;
import java.util.List;

class Solution {
    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minsArr = new int[n];

        for (int i = 0; i < n; i++) {
            String tp = timePoints.get(i);
            minsArr[i] = Integer.valueOf(tp.substring(0, 2)) * 60 +
                    Integer.valueOf(tp.substring(3));
        }

        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(minsArr);
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, minsArr[i] - minsArr[i - 1]);
        }

        minDiff = Math.min(minDiff, 24 * 60 - minsArr[n - 1] + minsArr[0]);

        return minDiff;

    }
}