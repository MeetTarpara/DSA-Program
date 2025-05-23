import java.util.Scanner;

public class P77_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String s = sc.nextLine();
        if (isValidWcWR(s)) {
            System.out.println("String matches the pattern w c wR.");
        } else {
            System.out.println("String does NOT match the pattern.");
        }

        sc.close();
    }

    public static boolean isValidWcWR(String s) {
        int n = s.length();
        int cIndex = s.indexOf('c');

        // Must have exactly one 'c' in the middle
        if (cIndex == -1) {
            return false;
        }

        String w = s.substring(0, cIndex);
        String wR = s.substring(cIndex + 1);

        // Check if wR is reverse of w
        String reversedW = new StringBuilder(w).reverse().toString();
        if (!reversedW.equals(wR)) {
            return false;
        }

        // w should contain only 'a' and 'b'
        for (char ch : w.toCharArray()) {
            if (ch != 'a' && ch != 'b') {
                return false;
            }
        }

        // wR should also only contain 'a' and 'b'
        for (char ch : wR.toCharArray()) {
            if (ch != 'a' && ch != 'b') {
                return false;
            }
        }

        return true;
    }
}
