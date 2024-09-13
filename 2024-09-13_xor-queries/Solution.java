class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] ^= arr[i - 1];
        }

        int n = queries.length;
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (start == 0) {
                answer[i] = arr[end];
            } else {
                answer[i] = arr[end] ^ arr[start - 1];
            }
        }

        return answer;
    }
}