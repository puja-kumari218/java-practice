// Write a Java program to convert a lowercase character to uppercase.

public class LowerToUpper {
    public static void main(String[] args) {
        char ch = 'b';  

        if (ch >= 'a' && ch <= 'z') {
            char upper = (char)(ch - 32);  
            System.out.println("Uppercase: " + upper);
        } else {
            System.out.println("Not a lowercase letter.");
        }
    }
}
