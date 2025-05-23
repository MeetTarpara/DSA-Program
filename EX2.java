
// EX2.java
// WAP to check whether a number is ugly or not (Ugly number is a number whose only prime factors
// are 2, 3, or 5. For example, 6 is ugly since it has only prime factors 2 and 3. 8 is ugly since
// it has only prime factor 2. 14 is not ugly since it has prime factors 2 and 7. 1 is typically
// treated as an ugly number, and 0 is not considered ugly.)
// Ugly numbers are positive numbers whose only prime factors are 2, 3, or 5.



public class EX2 {

    public static boolean hasOnly235Factors(int num) {
        if (num == 0) return false;

        while (num % 2 == 0) num /= 2;
        while (num % 3 == 0) num /= 3;
        while (num % 5 == 0) num /= 5;

        return num == 1;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 6, 10, 14, 18, 30, 49};

        for (int n : testNumbers) {
            if (hasOnly235Factors(n)) {
                System.out.println(n + " has only 2, 3, 5 as prime factors (Ugly Number)");
            } else {
                System.out.println(n + " has other prime factors (Not Ugly)");
            }
        }
    }
}
