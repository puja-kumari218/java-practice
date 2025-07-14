//  Write a Java program to check whether a character is a vowel or consonant.

public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch = 'e';  

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Not an alphabet.");
        }
    }
}
