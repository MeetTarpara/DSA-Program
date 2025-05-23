public class P69 {
    public static void main(String[] args) {
        int n = 11;
        System.out.println(findNthDigit(n));  // Output: 0
    }

    public static int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder();
        int number = 1;

        // Keep appending until length becomes >= n
        while (sb.length() < n) {
            sb.append(number);
            number++;
        }

        return sb.charAt(n - 1) - '0'; // n-1 because index starts from 0
    }
}
