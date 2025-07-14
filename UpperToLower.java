//  Write a Java program to convert an uppercase character to lowercase.

public class UpperToLower {
    public static void main(String[] args) {
        char ch = 'A';  

        if (ch >= 'A' && ch <= 'Z') {
            char lower = (char)(ch + 32);  
            System.out.println("Lowercase: " + lower);
        } else {
            System.out.println("Not an uppercase letter.");
        }
    }
}
