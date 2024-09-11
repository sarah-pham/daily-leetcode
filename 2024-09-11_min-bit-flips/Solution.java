class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while (start != 0 && goal != 0) {
            if (start % 2 != goal % 2) {
                flips++;
            }
            start /= 2;
            goal /= 2;
        }

        int x = Math.max(start, goal);
        while (x != 0) {
            if (x % 2 != 0) {
                flips++;
            }
            x /= 2;
        }

        return flips;
    }
}