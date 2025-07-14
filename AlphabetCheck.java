//  Write a Java program to check whether a character is an alphabet or not.

public class AlphabetCheck {
    public static void main(String[] args) {
        char ch = '8'; 

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }
    }
}
