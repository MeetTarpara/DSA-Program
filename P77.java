import java.util.Scanner;
import java.util.Stack;

public class P77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        if (isPatternMatched(s)) {
            System.out.println("String matches pattern w c wR.");
        } else {
            System.out.println("String does NOT match the pattern.");
        }

        sc.close();
    }

    public static boolean isPatternMatched(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        int n = s.length();

        // Step 1: Push characters until 'c'
        while (i < n && s.charAt(i) != 'c') {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'b') {
                return false; // Invalid character
            }
            stack.push(ch);
            i++;
        }

        // 'c' must exist
        if (i == n || s.charAt(i) != 'c') {
            return false;
        }

        i++; // Skip the 'c'

        // Step 2: Compare characters after 'c' with popped stack
        while (i < n) {
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'b') return false; // invalid character
            if (stack.isEmpty() || stack.pop() != ch) {
                return false;
            }
            i++;
        }

        // If stack is not empty, extra chars in w
        return stack.isEmpty();
    }
}
