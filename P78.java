// Evaluate Prifix Expression

import java.util.Scanner;
import java.util.Stack;

public class P78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a prefix expression (e.g. + 9 * 2 3): ");
        String expression = sc.nextLine();
        System.out.println("Result: " + evaluatePrefix(expression));
        sc.close();
    }

    public static int evaluatePrefix(String s){
        Stack<Integer> stack = new Stack<>();
        String[] tokens = s.trim().split(" ");
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (isOperator(token)) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(applyOperator(token, a, b));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();    
    }

    public static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }

}
