
import java.util.Stack;

//WAP to convert infix expression into postfix expression. 

public class P79 {
    public static void main(String[] args) {
        String infix = "3 + 5 * ( 2 - 8 )";
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: " + postfix);
    }

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : infix.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch).append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.pop(); // pop the '('
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfix.append(stack.pop()).append(' ');
        }

        return postfix.toString().trim(); // remove trailing space
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1; // invalid operator
        }
    }
}
