package practice;

public class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 15;
        char ch = '+';

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("invalid");

        }

    }
}
