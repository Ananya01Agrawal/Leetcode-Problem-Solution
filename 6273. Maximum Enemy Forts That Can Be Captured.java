class Solution {
    public int captureForts(int[] forts) {
        int best = 0;
        best = Math.max(best, bestFromLeft(forts));
        int n = forts.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = forts[n - 1 - i];
        }
        best = Math.max(best, bestFromLeft(reversed));
        return best;
    }

    int bestFromLeft(int[] forts) {
        int n = forts.length;
        int best = 0;
        for (int i = 0; i < n; i++) {
            if (forts[i] == 1) {
                int j = i;
                while (j < n - 1 && forts[j + 1] == 0) {
                    j++;
                }
                if (j < n - 1 && forts[j + 1] == -1) {
                    best = Math.max(best, j - i);
                }
            }
        }
        return best;
    }
}
