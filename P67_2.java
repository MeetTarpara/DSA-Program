import java.util.*;

public class P67_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String infix = sc.nextLine();

        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: " + postfix);

        int result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);

        sc.close();
    }

    // Function to convert infix to postfix
    public static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char ch : infix.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch);
            } 
            else if (ch == '(') {
                stack.push(ch);
            } 
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // remove '('
            } 
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Function to evaluate postfix expression
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : postfix.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // convert char to int
            } 
            else {
                int b = stack.pop();
                int a = stack.pop();
                int res = calculate(a, b, ch);
                stack.push(res);
            }
        }

        return stack.pop();
    }

    // Helper to check if character is an operator
    public static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    // Helper to return precedence
    public static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    // Helper to perform calculation
    public static int calculate(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b; // Assume b != 0
        }
        return 0;
    }
}
