import java.util.Scanner;
import java.util.Stack;

public class P67 {

    public static int evaluate(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> ops = new Stack<>();

        int num = 0;
        char sign = '+';
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
                                    
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) && ch != ' ' || i == n - 1) {
                if (sign == '+') {
                    nums.push(num);
                } else if (sign == '-') {
                    nums.push(-num);
                } else if (sign == '*') {
                    nums.push(nums.pop() * num);
                } else if (sign == '/') {
                    nums.push(nums.pop() / num);
                }
                sign = ch;
                num = 0;
            }
        }

        int result = 0;
        for (int number : nums) {
            result += number;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression: ");
        String expression = sc.nextLine();

        int result = evaluate(expression);
        System.out.println("Result of the expression: " + result);

        sc.close();
    }
}