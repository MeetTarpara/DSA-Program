public class P73 {
    public static int countValidWays(String s) {
        int n = s.length();
        int totalWays = 0;

        // Precompute number of 0s and 1s before each position
        int[] count0 = new int[n];
        int[] count1 = new int[n];

        // Initialize first element
        if (s.charAt(0) == '0') {
            count0[0] = 1;
        } else {
            count1[0] = 1;
        }

        // Build prefix sums
        for (int i = 1; i < n; i++) {
            count0[i] = count0[i - 1];
            count1[i] = count1[i - 1];

            if (s.charAt(i) == '0') {
                count0[i]++;
            } else {
                count1[i]++;
            }
        }

        // Now pick each building as middle building (index j)
        for (int j = 1; j < n - 1; j++) {
            if (s.charAt(j) == '0') {
                // Middle is '0', so before must be '1' and after must be '1'
                int before1 = count1[j - 1];
                int after1 = count1[n - 1] - count1[j];
                totalWays += before1 * after1;
            } else {
                // Middle is '1', so before must be '0' and after must be '0'
                int before0 = count0[j - 1];
                int after0 = count0[n - 1] - count0[j];
                totalWays += before0 * after0;
            }
        }

        return totalWays;
    }

    public static void main(String[] args) {
        String s = "001101";
        System.out.println("Valid ways = " + countValidWays(s));
    }
}